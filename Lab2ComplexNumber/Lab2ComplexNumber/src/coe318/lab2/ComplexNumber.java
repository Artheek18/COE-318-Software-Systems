package coe318.lab2;
/**
 * ComplexNumber models a complex number expressed
 * in rectangular form (real and imaginary parts).
 * It is an <em>immutable</em> object.
 *
 * @author Artheeckkuarran Shanmugalingam
 */
public class ComplexNumber {
  //Instance variable declarations
    
    double realNum;
    double imaginaryNum;

  /**
   * Construct a ComplexNumber given its
   * real and imaginary parts.
   * @param re The real component
   * @param im The imaginary component
   */
  public ComplexNumber(double re, double im) {
      //Initialize the instance variables
      realNum = re;
      imaginaryNum = im;
  }

  /**
   * Returns the real component.
   * @return the real
   */
  public double getReal() {
      return realNum;  //A stub: to be fixed
  }

  /**
   * Returns the imaginary component.
   * @return the imaginary
   */
  public double getImaginary() {
      return imaginaryNum;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber number that is
   * the negative of <em>this</em>.  Note: the
   * original ComplexNumber is <b>NOT</b>
   * modified.
   * @return -this
   */
  public ComplexNumber negate() {
      ComplexNumber negate = new ComplexNumber(realNum, imaginaryNum);
      negate.realNum = realNum*-1;
      negate.imaginaryNum = -1*imaginaryNum;
      return negate; //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber that is the
   * sum of <em>this</em>  and <em>z</em>.
   * Note: the  original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this + z
   */
  public ComplexNumber add(ComplexNumber z) {
      ComplexNumber add = new ComplexNumber(realNum, imaginaryNum);
      add.realNum = realNum + z.realNum;
      add.imaginaryNum = imaginaryNum + z.imaginaryNum;
      
      return add;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber that is the
   * difference of <em>this</em>  and <em>z</em>.
   * Note: the  original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this + z
   */
  public ComplexNumber subtract(ComplexNumber z) {
      ComplexNumber subtract = new ComplexNumber(realNum, imaginaryNum);
      subtract.realNum = realNum - z.realNum;
      subtract.imaginaryNum = imaginaryNum - z.imaginaryNum;
      
      return subtract;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber that is the
   * product of <em>this</em> and <em>z</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this * z
   */
  public ComplexNumber multiply(ComplexNumber z) {
      ComplexNumber multiply = new ComplexNumber(realNum, imaginaryNum);
      multiply.realNum = realNum*z.realNum+(-1*(imaginaryNum*z.imaginaryNum));
      multiply.imaginaryNum = realNum*z.imaginaryNum+(imaginaryNum*z.realNum);
      
      
      return multiply;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber that is
   * the reciprocal of <em>this</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @return 1.0 / this
   */
  public ComplexNumber reciprocal() {
      ComplexNumber reciprocal = new ComplexNumber(realNum, imaginaryNum);
      reciprocal.realNum = realNum/(realNum*realNum+(imaginaryNum*imaginaryNum));
      reciprocal.imaginaryNum = imaginaryNum/(realNum*realNum+(imaginaryNum*imaginaryNum));
      return reciprocal;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber that is
   * <em>this</em> divided by <em>z</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this / z
   */
  public ComplexNumber divide(ComplexNumber z) {
      ComplexNumber divide = new ComplexNumber(realNum, imaginaryNum);
      divide.realNum = ((realNum*z.realNum)+(-1*(imaginaryNum*(z.imaginaryNum*-1))))/(z.realNum*z.realNum + (z.imaginaryNum*z.imaginaryNum));
      divide.imaginaryNum = ((realNum*(z.imaginaryNum*-1))+(imaginaryNum*z.realNum))/(z.realNum*z.realNum + (z.imaginaryNum*z.imaginaryNum));
      return divide;  //A stub: to be fixed
  }

  /**
   * Returns a String representation of
   * <em>this</em> in the format:
   * <pre>
   * real +-(optional) i imaginary
   * </pre>
   * If the imaginary part is zero, only the
   * real part is converted to a String.
   * A "+" or "-" is placed between the real
   * and imaginary parts depending on the
   * the sign of the imagrinary part.
   * <p>
   * Examples:
   * <pre>
   *  ..println(new ComplexNumber(0,0); -> "0.0"
   *  ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
   *  ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
   * </pre>
   * @return the String representation.
   */
  @Override
  public String toString() {
      //DO NOT MODIFY THIS CODE!
      String str = "" + this.getReal();
      if (this.getImaginary() == 0.0) {
          return str;
      }
      if (this.getImaginary() > 0) {
          return str + " + i" + this.getImaginary();
      } else {
          return str + " - i" + -this.getImaginary();
      }
  }
}