package Chapter_13.Exercise_17;

public class Test_17 {
    public static void main(String[] args) {
        Complex c1=new Complex(5,6);
        Complex c2=new Complex(9,3);

        System.out.println("the sum is "+c1.add(c2));
        System.out.println("the subt is "+c1.sub(c2));
        System.out.println("the mult is "+c1.multiply(c2 ));
        System.out.println("the abs is "+c1.abs());

        System.out.println(c1.compareTo(c2));

        Complex c3=(Complex) c1.clone();
        System.out.println(c3.toString());
    }
}
