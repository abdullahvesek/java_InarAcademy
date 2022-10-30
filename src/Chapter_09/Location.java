package Chapter_09;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Location {
    public int row;
    public int col;
    public double maxValue;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public double getMaxValue() {
        return maxValue;
    }

    Location(int row, int col, double maxValue){
        this.row=row;
        this.col=col;
        this.maxValue=maxValue;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of row and col:");
        int row= input.nextInt();
        int col= input.nextInt();
        double[][]matrix=new double[row][col];

        System.out.println("enter matrix:" );
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j]=input.nextDouble();
            }
        }


        Location vesek=locateLargest(matrix);
        System.out.println("the largest value is "+vesek.getMaxValue());
        System.out.println("the index is ( "+vesek.getRow()+" , "+vesek.getCol()+" )");
    }
    public static Location locateLargest(double[][] a){
      int index1=0;
      int index2=0;
      double value=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
               if (a[i][j]>value){
                   index1=i;
                   index2=j;
                   value=a[i][j];
               }
            }
        }
    Location result=new Location(index1,index2,value);
    return result;
    }
}
