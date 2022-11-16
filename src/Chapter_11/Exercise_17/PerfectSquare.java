package Chapter_11.Exercise_17;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter a number ");
        int number = input.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        takePrimes(number, list);

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    res.add(list.get(j));

                }
            }
        }
        int result = 1;
        for (int i = 0; i < list.size(); i++) {
            if (!(res.contains(list.get(i)))) {
                result *= list.get(i);
            }

        }

        System.out.println("the perfect square is " + (result * number));


    }

    private static void takePrimes(int number, ArrayList<Integer> list) {
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                list.add(i);
                number = number / i;
            }
        }

        list.add(number);
    }


}