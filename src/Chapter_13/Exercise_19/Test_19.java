package Chapter_13.Exercise_19;
import java.util.*;

import java.math.BigInteger;
public class Test_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a decimal number: ");
        String[] decimal = input.nextLine().split("[.]");


        Rational r1 = new Rational(new BigInteger(decimal[0]), BigInteger.ONE);


        Rational r2 = new Rational(new BigInteger(decimal[1]), new BigInteger(
                String.valueOf((int)Math.pow(10, decimal[1].length()))));


        System.out.println("The fraction number is " +
                (decimal[0].charAt(0) == '-' ? (r1).subtract(r2) : (r1).add(r2)));
    }
}
