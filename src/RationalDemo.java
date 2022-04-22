import java.util.Scanner;

public class RationalDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
          System.out.print("Enter Your name:");
          String name = input.nextLine();
        System.out.println("Hello " + name + ",  welcome to a program of Rational Data type.");

        Rational f1 = new Rational(1,2);
        Rational f2 = new Rational(2,3);
        Rational f3 = new Rational(2,4);
        Rational f4 = new Rational(1,2);

        System.out.println("fraction 1 is " + f1 + " and fraction 2 is " + f2);
        System.out.println("Sum of the two fractions is " + f1.add(f2) );
        System.out.println("product of the two fractions is " + f1.multiply(f2) );
        System.out.println("Difference of the two fractions is " + f1.subtract(f2) );
        System.out.println("Quotient of the two fractions is " + f1.divide(f2) );

        // Testing Equality of two rational numbers.
        System.out.println("Fractions "+ f2 + " and "+ f3 +  f2.equal(f3));
        System.out.println("Fractions "+ f1 + " and "+ f4 +  f1.equal(f4));

    }
}
