package Chapter_13.Exercise_12;

public class Octagon extends GeometricObject implements Cloneable,Comparable<Octagon>{
    private double side=1;

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon() {
        this(0);
    }

    @Override
    public double getArea() {
        return side*8;
    }

    @Override
    public double getPerimeter() {
        return 8*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public int compareTo(Octagon o) {
        if (this.getArea()>o.getArea())
            return 1;
        else if(this.getArea()<o.getArea())
            return -1;
        else
            return 0;
    }

@Override
    public Object clone(){
        try {
          return   super.clone();
        }catch (CloneNotSupportedException ex ){
            return null;
        }
}



}
