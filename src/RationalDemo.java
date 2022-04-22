import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class RationalDemo {
    public static void main(String[] args){
          System.out.println(" hello lawrence");

        Rational f1 = new Rational(1,2);
        Rational f2 =new Rational(2,3);

        System.out.println("fraction 1 is " + f1 + " and fraction 2 is " + f2);
        System.out.println("Sum of the two fractions is " + f1.add(f2) );
        System.out.println("product of the two fractions is " + f1.multiply(f2) );
        System.out.println("Difference of the two fractions is " + f1.subtract(f2) );
        System.out.println("Quotient of the two fractions is " + f1.divide(f2) );

    }
}
