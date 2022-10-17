package Chapter_08;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of column and row:");
        int row= input.nextInt();
        int col= input.nextInt();

        int [][]matrix=new int[row][col];

        System.out.println("enter the list now");
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j]=input.nextInt();

            }
        }

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        int max=matrix[0][0];
        int index1=0;
        int index2=0;

        for (int i = 0; i < matrix.length;  i++) {
            for (int j = 0;  j<matrix[i].length ; j++) {

               if(matrix[i][j]>max){
                   index1=i;
                   index2=j;
                   max=matrix[i][j];
               }

            }
        }

        System.out.println("the largest element index is ("+index1+" , "+index2+" )");


    }
}
