package Chapter_08;

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of cities:");
        int number= input.nextInt();
       double[][]points=new double[number][2];
        System.out.println("enter coordinates of cities:");

        for (int i = 0; i <points.length ; i++) {
            for (int j = 0; j <points[i].length ; j++) {
                points[i][j]=input.nextDouble();
            }
        }
            double dis=0;
            double index1=0;
            double index2=0;
        for (int i = 0; i < points.length ; i++) {
        double distance=distance(points[i][0],points[i][1],points);

       if (distance>dis){
           index1=points[i][0];
           index2=points[i][1];
           dis=distance;
       }

        }
        System.out.println("the center city location is "+"( "+index1+" ,"+index2+" )");
        System.out.printf("the total distance is %.2f ",dis);
    }

public static double distance(double p1,double p2,double[][]points){
    double distance=0;
        for (int i = 0; i < points.length ; i++) {
        distance+=Math.sqrt(Math.pow(points[i][0]-p1,2)+Math.pow(points[i][1]-p2,2));
    }
 return distance;

    }

}
