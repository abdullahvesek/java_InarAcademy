package Chapter_13.Exercise_12;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius = 1;

    public Circle() {
        this(1);
    }

    public Circle(double side) {
        this.radius = side;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius)
            return 1;
        else if (this.radius < o.radius)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        return this.compareTo((Circle) o) == 0;
    }


}
