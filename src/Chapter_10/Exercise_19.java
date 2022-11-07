package Chapter_10;
import java.math.BigInteger;
public class Exercise_19 {
    public static void main(String[] args) {



        for (BigInteger p = new BigInteger("2");
             p.compareTo(new BigInteger("100")) <= 0;
             p = p.add(new BigInteger("1"))) {


      if (isPrime(mersenne(p)))

          System.out.printf("%5d%7s%7d\n",p,"    ",mersenne(p));
  }



    }

public static BigInteger mersenne(BigInteger d){
        BigInteger x=new BigInteger("2");
        for (BigInteger i=new BigInteger("1");i.compareTo(d)<0;i=i.add(BigInteger.ONE)) {
            x= x.multiply(new BigInteger("2"));
        }
        x=x.subtract(BigInteger.ONE);
        return x;
    }



    public static boolean isPrime(BigInteger n) {
        for (BigInteger d = new BigInteger("2");
             d.compareTo(n.divide(new BigInteger("2"))) <= 0;
             d = d.add(new BigInteger("1"))) {
            if (n.remainder(d).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        return true;
    }




}
