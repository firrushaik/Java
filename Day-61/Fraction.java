package OOPS; 
 
public class Fraction { 
 private int numerator; 
 private int denominator; 
 
 
 public Fraction(int numerator,int denominator) { 
     this.numerator = numerator; 
     this.denominator = denominator; 
 } 
 
 public Fraction() { 
 
 } 
 
 
 
 public void setNumerator(int numerator) { 
     this.numerator = numerator; 
 } 
 
 public void setDenominator(int denominator) { 
     this.denominator = denominator; 
 } 
 
 public int getNumerator() { 
     return numerator; 
 } 
 
 
 public int getDenominator() { 
     return denominator; 
 } 
 
 public void printFraction() { 
     simplify(); 
     System.out.println(this.numerator +"/"+ this.denominator); 
 } 
 
 
 public void simplify() { 
     int minimum = Math.min(this.numerator,this.denominator); 
     int gcd = 1; 
 
     for(int i=2;i<=minimum;i++) { 
         if(numerator%i==0 && denominator%i==0) { 
             gcd = i; 
         } 
     } 
 
     this.numerator = this.numerator/gcd; 
     this.denominator = this.denominator/gcd; 
 } 
 
 public void incrementByOne() { 
     this.numerator = this.numerator+this.denominator; 
     printFraction(); 
 } 
 
 public void decrementByOne() { 
     this.numerator = this.numerator-this.denominator; 
     printFraction(); 
 } 
 
 public  Fraction addTwoFractions(Fraction fraction2) { 
     Fraction result = new Fraction(); 
 
     result.numerator = this.numerator* fraction2.denominator + 
fraction2.numerator* this.denominator; 
 
     result.denominator = this.denominator* fraction2.denominator; 
 
     return result; 
 
 } 
 
 public Fraction subtractTwoFractions(Fraction fraction2) { 
     Fraction result = new Fraction(); 
 
     result.numerator = (this.numerator* fraction2.denominator) - 
(fraction2.numerator*this.denominator); 
 
     result.denominator = this.denominator* fraction2.denominator; 
 
     return result; 
 } 
 
 public Fraction multiplyTwoFractions(Fraction fraction2) { 
     Fraction result = new Fraction(); 
 
     result.numerator = this.numerator * fraction2.numerator; 
     result.denominator = this.denominator* fraction2.denominator; 
     return result;