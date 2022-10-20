package Chapter_08;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 8 points: ");

       double[][]points=new double[4][2];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <2 ; j++) {
                points[i][j]=input.nextDouble();
            }
        }

        System.out.println("the intersection points is:");
       double[]w=new double[2];
       w= getIntersectingPoint(points);
        System.out.println(w);
    }


    public static double[] getIntersectingPoint(double[][] points) {
        double[][] a = new double[2][2];

        double[] b = new double[2];


        a[0][0] = points[0][1] - points[1][1];
        a[0][1] = -1 * (points[0][0] - points[1][0]);
        a[1][0] = points[2][1] - points[3][1];
        a[1][1] = -1 * (points[2][0] - points[3][0]);
        b[0] = (points[0][1] - points[1][1]) * points[0][0] -
                (points[0][0] - points[1][0]) * points[0][1];
        b[1] = (points[2][1] - points[3][1]) * points[2][0] -
                (points[2][0] - points[3][0]) * points[2][1];

        return Exercise_30.linear(a, b);
    }


}
