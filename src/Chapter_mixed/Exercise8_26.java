package Chapter_mixed;

import java.util.*;
import java.util.Scanner;

public class Exercise8_26 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 9 number ");
        ArrayList<Double>list=new ArrayList<>();
      double[][]arr=new double[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                list.add(input.nextDouble());
            }
        Collections.sort(list);
            for (int j = 0; j <3 ; j++) {
                arr[i][j]=list.get(j);
            }
        list.clear();
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
