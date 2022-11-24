package Chapter_12.Exercise_13;

import java.io.*;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("wrong usage ");
            System.exit(0);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("the is no file ");
            System.exit(1);
        }
        int line = 0;
        int ch = 0;
        int word = 0;


        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                line++;
                ch += s.length();


            }
        }

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String a = input.next();
                word++;
            }
        }


        System.out.println("the number of char is " + ch + "\n word is " + word + "\nline is " + line);
    }
}
