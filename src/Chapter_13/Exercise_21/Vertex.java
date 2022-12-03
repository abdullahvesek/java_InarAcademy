package Chapter_13.Exercise_21;
import java.math.BigInteger;
import java.util.*;

public class Vertex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger b1=new BigInteger(input.next());
        BigInteger b2=new BigInteger(input.next());
        BigInteger b3=new BigInteger(input.next());

        System.out.print("Enter a, b, c: ");
        Rational a = new Rational(b1, new BigInteger("1"));
        Rational b = new Rational(b2, new BigInteger("1"));
        Rational c = new Rational(b3, new BigInteger("1"));


        System.out.println("the vertex is "+ a.add(b));
    }
}
