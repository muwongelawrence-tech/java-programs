public class Rational {
    private int numerator;
    private int denominator;
    public Rational( int numerator , int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }


    // default constructor
    public Rational(){
        numerator =1;
        denominator =1;
    }

    //Reducing the fraction to is lowest terms
    private void reduce(){
        int divisor = gcf(numerator,denominator);
        numerator= numerator/divisor;
        denominator= denominator/divisor;
    }
}
