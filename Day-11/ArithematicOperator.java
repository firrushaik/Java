Arithematic operator : Arithematic operators are used to perform common mathematical problems.

Arithematic operators are listed below :

Addition (+)

Subtraction(-)

Multiplication(*)

Division(/)

Modulus(%) // It is nothing but remainder.

Example :

public class ArithematicOperator {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 50;
        int add = num1 + num2;
        int sub = num1 - num2;
        int  mul = num1 * num2;
        int division = num1/num2;
        int modulo = num1%num2;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(division);
        System.out.println(modulo);

    }
}

output :

90
-10
2000
0
40

Some other example:

public class Arithematic2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;

        System.out.println("addition is:" + (a+b));
        System.out.println("subtraction is:" + (a-b));
        System.out.println("multiplication is:" + (a*b));
        System.out.println("division is:" + (a/b));
        System.out.println("modulus is:" + (a%b));
    }
}

output:

addition is:60
subtraction is:-20
multiplication is:800
division is:0
modulus is:20
