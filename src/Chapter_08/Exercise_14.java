package Chapter_08;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter length of square matrix: ");
        int le= input.nextInt();

        int[][]matrix=new int[le][le];

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j]=(int)(Math.random()*2);

            }
        }





    }





    }



