package Chapter_08;

import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][]arr1=new int[3][3];
        Exercise_16.fillArray(arr1);
        Exercise_16.print(arr1);

        int[][]arr2=new int[3][3];
        Exercise_16.fillArray(arr2);
        Exercise_16.print(arr2);
        System.out.println("the arr1 and arr2 is  "+(equals(arr1,arr2)?"strictly equal":" not strictly equal"));

    }

    public static boolean equals(int[][] m1, int[][] m2){
        if(m1.length!=m2.length){ //we can check all rows length but now it is not necessary
            return false;
        }
        for (int row = 0; row <m1.length ; row++) {
            for (int col = 0; col <m1[row].length ; col++) {// ı write m1[row] because ı want a dynamıc
                if (m1[row][col]!=m2[row][col]){
                    return false;
                }
            }
        }
           return  true;
    }





}
