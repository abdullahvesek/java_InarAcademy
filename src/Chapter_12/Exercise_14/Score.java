package Chapter_12.Exercise_14;

import java.io.File;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("enter file name ");
        String file = input.nextLine();

        File file1 = new File(file);
        if (!file1.exists()) {
            System.out.println("File " + file + " does not exist");
            System.exit(1);
        }


        int count = 0;
        double total = 0;

        try (
                Scanner in = new Scanner(file1);
        ) {
            while (in.hasNext()) {
                String a = input.next();
                count++;
                total += Integer.parseInt(a);
            }
        }


        System.out.println("the total is " + total + " the average is " + (total / count));

    }
}
