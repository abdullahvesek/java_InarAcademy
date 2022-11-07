package Chapter_10;

import java.math.BigInteger;

public class Exercise_17 {
    public static void main(String[] args) {
        BigInteger longg=new BigInteger(Long.MAX_VALUE+"");

        for (int i = 0; i <10 ; i++) {
            System.out.println(longg.multiply(longg));
            longg=longg.add(BigInteger.ONE);
        }

    }
}
