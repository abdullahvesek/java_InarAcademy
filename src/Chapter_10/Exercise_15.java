package Chapter_10;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 points: ");
        double[][]points=new double[5][2];
        getpoints(points);
         double minY=getMinY(points);
         double maxY=getMaxY(points);
         double minX=getMinX(points);
         double maxX=getMaxX(points);
         double width=Math.abs(maxX-minX);
         double height=Math.abs(maxY-minY);
         double centerX=(maxX+minX)/2;
         double centerY=(maxY+minY)/2;
         MyRectangle2D r=new MyRectangle2D(centerX,centerY,width,height);

        System.out.println("the center is "+r.getX()+" , "+r.getY());
        System.out.println("the width is "+r.getWidth()+" the height is  "+r.getHeight());

    }

    public static double getMaxX(double[][]points){
        double max=points[0][0];
        for (int i = 1; i <5 ; i++) {
            if (points[i][0]>max)
                max=points[i][0];
        }

        return max;
    }



    public static double getMinX(double[][]points){
        double min=points[0][0];
        for (int i = 1; i <5 ; i++) {
            if (points[i][0]<min)
                min=points[i][0];
        }

        return min;
    }
public static double getMinY(double[][]points){
        double min=points[0][1];
    for (int i = 1; i <5 ; i++) {
        if (points[i][1]<min)
            min=points[i][1];
    }

    return min;
    }

    public static double getMaxY(double[][]points){
        double max=points[0][1];
        for (int i = 1; i <5 ; i++) {
            if (points[i][1]>max)
                max=points[i][1];
        }

        return max;
    }


    public static void getpoints(double[][]points){
    Scanner input=new Scanner(System.in);
        for (int i = 0; i < points.length ; i++) {
        for (int j = 0; j <points[i].length ; j++) {
            points[i][j]=input.nextDouble();
        }
    }
}


}
