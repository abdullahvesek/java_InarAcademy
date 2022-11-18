package Chapter_12.Exercise_05;

public class IllegalTriangleExeption extends Exception {
    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleExeption(double side1, double side2, double side3) {
        super("the sides are not good " + side1 + " " + side2 + " " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

}
