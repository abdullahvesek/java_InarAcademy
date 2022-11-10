package Weeks.week10;

import java.util.Scanner;

public class MaxRow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("the index is "+getTheRowWithTheMaxIndex(arr));
    }

    public static int getTheRowWithTheMaxIndex(int[][] matrix) {
        int sum = Integer.MIN_VALUE;
        int tempSum;
        int index = -1;


        for (int row = 0; row < matrix.length; row++) {
            tempSum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                tempSum += matrix[row][col];
            }
            if (tempSum > sum){
                index = row;
                sum = tempSum;
            }
        }
        return index;
    }

}
