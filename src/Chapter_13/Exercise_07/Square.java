package Chapter_13.Exercise_07;

import Chapter_13.Exercise_05.GeometricObject;

public class Square extends GeometricObject implements Colorable{

double side;

   public Square(){
       this(0);
   }


    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4 ;
    }

@Override
    public void howToColor(){
    System.out.println("the color is "+getColor());
}

}
