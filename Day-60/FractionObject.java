package OOPS;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    Fraction() {
    }

    public void simplify() {
        int min = Math.min(numerator, denominator);
        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException();
        }
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
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public void addFraction() {
        this.numerator = this.numerator + this.denominator;
        simplify();
    }

    public Fraction addTwoFractions(Fraction fraction2) {
        Fraction resultFraction = new Fraction();
        resultFraction.numerator = (this.numerator * fraction2.denominator) +
                (fraction2.numerator * this.denominator);
        resultFraction.denominator = this.denominator * fraction2.denominator;
        return resultFraction;

    }
}
