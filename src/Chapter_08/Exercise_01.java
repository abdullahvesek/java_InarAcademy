package Chapter_08;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of rows and columns:  ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] matrix = new double [row][column];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j]=input.nextDouble();
            }
        }

        for (int i = 0; i <matrix[0].length ; i++) {

            double total=0;
            for (int j = 0; j < matrix.length ; j++) {
                total+=matrix[j][i];
            }

            System.out.println("the column "+i+" 's sum is "+total);

        }




    }
}