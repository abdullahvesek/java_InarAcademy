package Chapter_12.Exercise_24;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) throws Exception {

        File file = new File("Vesek.txt");
        String[] a = {"asistan", "associate", "full"};


        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 1; i < 1001; i++) {
                System.out.print("Firstname" + i + " " + "Lastname" + i);
                String s = a[(int) (Math.random() * 3)];
                System.out.print(" " + s);
                System.out.print(" " + getsalary(s));
                System.out.println();

            }
        }

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                System.out.println(s);
            }
        }

    }

    private static int getsalary(String s) {
        int salary = 0;

        switch (s) {
            case "asistan":
                salary = (50000 + ((int) (Math.random() * 30000)));
                break;
            case "associate":
                salary = (60000 + ((int) (Math.random() * 50000)));
                break;
            case "full":
                salary = (75000 + ((int) (Math.random() * 50000)));
                break;
        }
        return salary;

    }


}
