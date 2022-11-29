package Chapter_13.Exercise_07;

import Chapter_13.Exercise_05.GeometricObject;

public class Test_07 {
    public static void main(String[] args) {
        GeometricObject []list={new Square("blue",true,5),new Square("red",true,8),new Square("green",true,2)};

        for (int i = 0; i < list.length ; i++) {
            System.out.println("the area  is "+list[i].getArea());
            System.out.println("How to color: " );
            ((Square) list[i]).howToColor();
        }
    }
}
