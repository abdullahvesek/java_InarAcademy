package Weeks.week_10;
import java.util.Scanner;
public class MaxCol {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("the index is "+getTheColWithTheMaxIndex(arr));
    }

    public static int getTheColWithTheMaxIndex(int[][] matrix) {
        int sum = Integer.MIN_VALUE;
        int tempSum;
        int index = -1;


        for (int col = 0; col < matrix.length; col++) {
            tempSum = 0;
            for (int row = 0; row < matrix[col].length; row++) {
                tempSum += matrix[row][col];
            }
            if (tempSum > sum) {
                index = col;
                sum = tempSum;
            }
        }
        return index;

    }
}