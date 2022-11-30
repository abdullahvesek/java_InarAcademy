package Chapter_13.Exercise_10;

public class Test_10 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(25, 88);
        Rectangle r2 = new Rectangle(25, 88);
        Rectangle r3 = new Rectangle(20, 2);

        System.out.println("the r1 and r2 is " + ((r1.equals(r2)) ? " " : "not") + " equal ");
        System.out.println("the r1 and r3 is " + ((r1.equals(r3)) ? " " : "not") + " equal ");
        System.out.println("the r3 and r2 is " + ((r3.equals(r2)) ? " " : "not") + " equal ");
    }
}
