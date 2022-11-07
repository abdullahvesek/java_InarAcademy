package Chapter_10;

import java.math.BigInteger;

public class Exercise_16 {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger zero = new BigInteger("0");
        int count = 0;

        while (count < 10) {
            if ((zero.compareTo(b.remainder(new BigInteger("2"))) == 0) ||
                    (zero.compareTo(b.remainder(new BigInteger("3"))) == 0)) {
                System.out.println(b);
                count++;


            }
          b=  b.add(BigInteger.ONE);
        }
    }
}