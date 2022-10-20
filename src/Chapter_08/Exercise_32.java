package Chapter_08;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 6 points:");
        double[][]points=new double[3][2];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2 ; j++) {
                points[i][j]=input.nextDouble();

            }
        }

        System.out.println("the area is "+getTriangleArea(points));


    }

    public static double getTriangleArea(double[][] points){

            double[] side = new double[3];


            if (linePosition(points) == 0)
                return 0;


            side[0] = Math.sqrt(Math.pow(points[1][0] - points[0][0], 2) +
                    Math.pow(points[1][1] - points[0][1], 2));

            side[1] = Math.sqrt(Math.pow(points[2][0] - points[1][0], 2) +
                    Math.pow(points[2][1] - points[1][1], 2));

            side[2] = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2) +
                    Math.pow(points[0][1] - points[2][1], 2));


            double s = 0;
            for (double e: side)
                s += e;
            s /= 2;


            double area = s;
            for (double i: side) {
                area *= (s - i);
            }
            return Math.sqrt(area);
        }

        public static double linePosition(double[][] points) {
            return
                    (points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) -
                            (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]);
        }
    }




