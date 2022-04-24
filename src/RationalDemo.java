import java.util.Scanner;

public class RationalDemo {
    public static void main(String[] args){

        // Rational   DataType
        Rational f1 = new Rational(1,2);
        Rational f2 = new Rational(2,3);
        Rational f3 = new Rational(2,4);
        Rational f4 = new Rational(1,2);

        // Testing arithmetic operations of the fractions.
        System.out.println("\n----------Testing arithmetic operations of the fractions ----------------");
        System.out.println("fraction 1 is " + f1 + " and fraction 2 is " + f2);
        System.out.println("Sum of the two fractions is " + f1.add(f2) );
        System.out.println("product of the two fractions is " + f1.multiply(f2) );
        System.out.println("Difference of the two fractions is " + f1.subtract(f2) );
        System.out.println("Quotient of the two fractions is " + f1.divide(f2) );

        // Testing Equality of two rational numbers.
        System.out.println("\n----------Testing Eqaulity ----------------");
        System.out.println("Fractions "+ f2 + " and "+ f3 +  f2.equal(f3));
        System.out.println("Fractions "+ f1 + " and "+ f4 +  f1.equal(f4));

        //Testing Getters and setters of Numerators and Denominators
        System.out.println("\n--------------Testing Getters and Setters----------------");
        f1.setNumerator(3);
        f1.setDenominator(4);
        System.out.println("Numerator of " + f1 + " is " +  f1.getNumerator());
        System.out.println("Denominator of " + f1 + " is " +  f1.getDenominator());
        System.out.println("After setting new parameters, new  f1 becomes " + f1);


    }
}
