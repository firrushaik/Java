package OOPS;
public class FractionExample {
    public static void main(String[] args) {
//        Fraction fraction1 = new Fraction();
//        fraction1.setNumerator(14);
//        fraction1.setDenominator(4);
//
//        fraction1.printFraction(); // 7/2
//
//        Fraction fraction2 = new Fraction(12,8); // 3/2
//        fraction2.printFraction();
//        Fraction fraction3 = new Fraction(1,0);
//        fraction3.printFraction(); // 1/2
//
//        fraction3.addFraction();
//
//        fraction3.printFraction(); // 3/2

        
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 5);
        Fraction fraction3 = fraction1.addTwoFractions(fraction2);

        fraction3.printFraction();
    }
}
