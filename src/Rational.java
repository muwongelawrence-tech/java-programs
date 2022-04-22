public class Rational {
    private int numerator;
    private int denominator;
    public Rational( int numerator , int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        reduceRraction();
    }


    // default constructor
    public Rational(){
        numerator =1;
        denominator =1;
    }

    //Reducing the fraction to is lowest terms
    private void reduceRraction(){
        int divisor = gcf(numerator,denominator);
        numerator= numerator/divisor;
        denominator= denominator/divisor;
    }

    private int gcf(int x, int y){
        int result;
        if(x<y){
            result = x;
        }
        else{
            result = y;
        }
        while(x%result != 0 || y%result != 0)
            result--;
        return result;
    }

    public  Rational multiply(Rational other){
        int newNumerator = this.numerator*other.numerator;
        int newDenominator = this.denominator* other.denominator;

        Rational r = new Rational(newNumerator,newDenominator);
        return r;

    }

    //the equal method
    public  void  equal(Rational other){
        if(this.numerator==other.numerator&&this.denominator==other.denominator){
            System.out.println("the 2 rational numbers are equal");
        }
        else
            System.out.println("The 2 rational numbers are not equal");
    }
    // the divide method

    public  Rational divide(Rational other){
        int newNumerator = this.numerator*other.denominator;
        int newDenominator = this.denominator* other.numerator;

        Rational r =new Rational(newNumerator, newDenominator);
        return r;

    }

    // addition
    public Rational addition(Rational other){
        int newNumerator = (this.numerator*other.denominator)+(this.denominator*other.numerator);
        int newDenominator = (this.denominator)*(other.denominator);

        Rational r =new Rational(newNumerator, newDenominator);
        return r;
    }

    // subtraction
    public Rational subtraction(Rational other){
        int newNumerator = (this.numerator*other.denominator) - (this.denominator*other.numerator);
        int newDenominator = (this.denominator)*(other.denominator);

        Rational r =new Rational(newNumerator,newDenominator);
        return r;
    }

    // setting the numerator and denominator
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    // output of the fraction
    public String toString() {
        return  numerator + "/" + denominator;
    }
}
