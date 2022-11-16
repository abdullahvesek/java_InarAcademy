package Chapter_11.Exercise_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Packing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of package ");
        int number = input.nextInt();
        System.out.println("enter weight of packages");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            list.add(input.nextInt());
        }

        java.util.Collections.sort(list);
        if (list.get(0) >= 6) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Container " + (i + 1) + " is " + list.get(i));
            }
        }


    }
}