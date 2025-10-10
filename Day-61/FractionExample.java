package OOPS; 


public class FractionExample { 
      public static void main(String[] args) { 
          Fraction fraction1 = new Fraction(2,3); 
          fraction1.printFraction(); 

          Fraction fraction2 = new Fraction(4,5); 
          Fraction fraction3 = fraction1.multiplyTwoFractions(fraction2); 

          fraction3.printFraction(); 
}
}