package Chapter_13.Exercise_12;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    private double width = 1;
    private double height = 1;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(10, 5);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }


    @Override
    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;

        } else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        return (this.compareTo((Rectangle) o)) == 0;
    }


}
