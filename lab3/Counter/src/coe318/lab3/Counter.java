/**
 *
 * @author Artheeckkumarran Shanmugalingam
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    
    int num;
    Counter leftDigit;
    int nextDig;
    int count;
    public Counter(int modulus, Counter left) {
        num = modulus;
        leftDigit = left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return num;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return leftDigit;
        
        
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return nextDig;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
       nextDig = digit;
        
        
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        nextDig++;
        if (nextDig == num){
            nextDig = 0;
            if(leftDigit != null ){
                leftDigit.nextDig++;
            }
            
        }
         
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(leftDigit == null){
            count = nextDig;
            
        }
        else {
           
            count = nextDig + (num*leftDigit.nextDig);
        }
        return count;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}