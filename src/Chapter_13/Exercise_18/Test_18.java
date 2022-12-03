package Chapter_13.Exercise_18;

import java.math.BigInteger;

public class Test_18 {
    public static void main(String[] args) {
        Rational r1 = new Rational(new BigInteger("1"), new BigInteger("2"));


        for (BigInteger i = r1.getNumerator().add(BigInteger.ONE); i.compareTo(new BigInteger("100")) <= 0; i = i.add(BigInteger.ONE)) {
            r1 = r1.add((new Rational(i, i.add(BigInteger.ONE))));

        }
        System.out.println("the result is " + r1);

    }
}
