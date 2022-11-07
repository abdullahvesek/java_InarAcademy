package Chapter_10;

import java.math.BigInteger;

public class Exercise_18 {
    public static void main(String[] args) {
       int count=0;
        BigInteger b=new BigInteger(Long.MAX_VALUE+"");

       while (count<10){
            if (isPrime(b)){
                count++;
                System.out.println(b);
            }
        b=b.add(BigInteger.ONE);
       }

    }




public static boolean isPrime(BigInteger b){

            for (BigInteger i =new BigInteger("2"); i.compareTo(b.divide(new BigInteger("2")))<=0 ; i=i.add(BigInteger.ONE)) {
         if (b.remainder(i).compareTo(new BigInteger("0"))==0)
             return false;

            }
return true;
    }
}



