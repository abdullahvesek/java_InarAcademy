package Chapter_08;

import java.util.Scanner;

public class Exercise_29 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][]arr1=new int[3][3];
        Exercise_16.fillArray(arr1);
        Exercise_16.print(arr1);

        System.out.println();

        int[][]arr2=new int[3][3];
        Exercise_16.fillArray(arr2);
        Exercise_16.print(arr2);


        System.out.println("\nthe arr1 and arr2 is  "+(equals(arr1,arr2)?"strictly equal":" not strictly equal"));

    }


    public static int[] matrixToArray(int[][] m) {
        int[] list = new int[m.length * m[0].length];
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                list[k] = m[i][j];
                k++;
            }
        }
        return list;
    }

    public static int[] sort(int[][] m) {
        int [] list = matrixToArray(m);
        for (int i = 0; i < 3; i++) {

            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < 3; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }


            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
        return list;
    }



    public static boolean equals(int[][] m1, int[][] m2) {
        int[] list1 = sort(m1);
        int[] list2 = sort(m2);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
