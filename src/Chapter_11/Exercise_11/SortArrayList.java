package Chapter_11.Exercise_11;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 5 numbers ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        sort(list);
        System.out.println("the sorted list is ");
        System.out.println(list.toString());
    }

    public static void sort(ArrayList<Integer> list) {
        java.util.Collections.sort(list);


    }
}