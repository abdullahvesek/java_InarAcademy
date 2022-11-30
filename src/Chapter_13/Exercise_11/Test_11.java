package Chapter_13.Exercise_11;

public class Test_11 {
    public static void main(String[] args) {
        Octagon o1=new Octagon(8);
        Octagon o2=new Octagon(8);
        Octagon o3=new Octagon(230);

        System.out.println(o1.compareTo(o2));
        System.out.println(o1.compareTo(o3));
        System.out.println(o2.compareTo(o3));

    }
}
