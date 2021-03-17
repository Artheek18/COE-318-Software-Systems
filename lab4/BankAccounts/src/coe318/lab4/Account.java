/**
 *
 * @author Artheeckkumarran Shanmugalingam
 */
package coe318.lab4;

/**
 *
 * @author arthe
 */
public class Account {
    public String name;
    public int num;
    public double startBal;
    
    public Account(String name, int number, double initialBalance){
        this.name = name;
        num = number;
        startBal = initialBalance;
        
    }
    
    public String getName(){
        
        return this.name;
    }
    
     public int getNumber(){
        
        return num;
    }
     
      public double getBalance(){
        
        return startBal;
    }
    
      
     public boolean deposit(double amount){
          
          if (amount > 0){
              
              startBal = startBal + amount;
          }
          return true;
      }
     
     public boolean withdraw(double amount){
         
          if (startBal < amount || amount <=0){
              
              return false;
          }
          else 
              startBal = startBal - amount;
                return true;
      }
      
    
    public String toString() {
//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " +String.format("$%.2f", getBalance()) + ")";
    }
    
}




