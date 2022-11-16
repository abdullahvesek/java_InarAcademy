package Chapter_11.Exercise_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<>();

        int count = 0;
        while (count < 5) {

            answers.clear();
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);

            System.out.println("what is " + a + " + " + b);
            int answer = 1;
            while (answer != (a + b)) {
                answer = input.nextInt();

                if (answer != (a + b) && (!(answers.contains(answer)))) {
                    System.out.println("wrong answer baby!!!");
                    System.out.println("what is " + a + " + " + b);
                }

                if (answers.contains(answer)) {
                    System.out.println("you already say it ");
                    System.out.println("what is " + a + " + " + b);
                }
                answers.add(answer);

            }
            System.out.println("you are right the answer is " + (a + b));
            count++;

        }


    }
}
