package Chapter_07;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter ten double number :");

        double[] list = new double[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();

        }
        System.out.println("the buble sorted list is: ");
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(double[] list) {
        double temp;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; i++) {

                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}

