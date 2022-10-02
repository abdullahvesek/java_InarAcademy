package Chapter_07;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        System.out.println("enter 10 integer:");
        int dif = 0;
        int[] numbers = new int[10];

        count(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                dif++;
                System.out.print(i + " ");

            }

        }
        System.out.println();
        System.out.println("the number of distinct is: "+dif);
    }

    public static void count(int[] numbers) {
        Scanner input = new Scanner(System.in);
        int num;
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();
            if ((num / 10) != 0)
                break;
            numbers[num]++;


        }


    }
}