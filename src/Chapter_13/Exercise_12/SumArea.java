package Chapter_13.Exercise_12;

import Chapter_13.Exercise_09.Circle;

public class SumArea {
    public static void main(String[] args) {
      GeometricObject [] list={new Octagon(5), new Octagon(8),
                new Rectangle(3, 4), new Rectangle(4, 2)};
        System.out.println("the sum is "+sum(list));
    }

    private static double sum(GeometricObject[] list) {
        double sum=0;
        for (int i = 0; i < list.length ; i++) {
            sum+=list[i].getArea();

        }

          return sum;
    }
}
