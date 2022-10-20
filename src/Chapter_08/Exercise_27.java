package Chapter_08;

import java.util.Scanner;

public class Exercise_27 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[][]matrix=new double[3][3];
        System.out.println("enter matrix");

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        sortCols(matrix);

        System.out.println("\n\n");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


    public static void sortCols(double[][] arr){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
               double min1=arr[j][i];
                int index=j;

                for (int k = j+1; k <3 ; k++) {
                    if (arr[k][i]<min1){
                        min1=arr[k][i];
                        index=k;
                    }
                }

                if (index!=j){
                    arr[index][i]=arr[j][i];
                    arr[j][i]=min1;
                }
            }
        }
    }


}
