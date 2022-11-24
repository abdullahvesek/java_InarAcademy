package Chapter_12.Exercise_16;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("must be 3 ");
            System.exit(0);
        }

        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("there is no file ");
            System.exit(1);
        }
        ArrayList<String> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                list.add(s.replaceAll(args[1], args[2]));


            }
        }
        try (

                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }
    }
}
