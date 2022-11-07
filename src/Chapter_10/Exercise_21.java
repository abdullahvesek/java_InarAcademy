package Chapter_10;

import java.math.BigInteger;

public class Exercise_21 {
    public static void main(String[] args) {
        BigInteger b=new BigInteger(Long.MAX_VALUE+"");
        b=b.add(BigInteger.ONE);
        int count=0;
        while (count<10){
            if ((b.remainder(new BigInteger("5")).compareTo(new BigInteger("0"))==0)||
                    b.remainder(new BigInteger("6")).compareTo(new BigInteger("0"))==0) {
                System.out.println(b);
                count++;
            }
            b=b.add(BigInteger.ONE);

        }
    }
}
