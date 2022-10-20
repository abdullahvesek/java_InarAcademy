package Chapter_08;

import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter coordinates of 6 points:");
        double[][] points = new double[6][2];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double[] res = find(points);

        System.out.println("the rigthmost lowest");
        for (int i = 0; i <2 ; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static double[] find(double[][] points) {
        double[] r = new double[2];
        for (int i = 0; i < points.length; i++) {
            double min0 = points[i][0];
            double min1 = points[i][1];
            int index = i;

            for (int j = i + 1; j < points.length; j++) {
                if (points[j][1] < min1) {
                    min0 = points[j][0];
                    min1 = points[j][1];
                    index = j;
                }
            }

            if (index != i) {
                points[index][0] = points[i][0];
                points[index][1] = points[i][1];
                points[i][0] = min0;
                points[i][1] = min1;
            }

        }
        for (int i = 0; i < points.length; i++) {
            double min0 = points[i][0];
            double min1 = points[i][1];
            int index = i;

            for (int j = i + 1; j < points.length; j++) {
                if (points[j][0] > min0 && points[j][1]==points[i][1]) {
                    min0 = points[j][0];
                    min1 = points[j][1];
                    index = j;
                }
            }

            if (index != i) {
                points[index][0] = points[i][0];
                points[index][1] = points[i][1];
                points[i][0] = min0;
                points[i][1] = min1;
            }

        }
r[0]=points[0][0];
        r[1]=points[0][1];
        return r;

    }
}