package Chapter_12.Exercise_11;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class RemoveJohn {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("no way ");
            System.exit(0);
        }

        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("there is no file ");
            System.exit(1);
        }
        ArrayList<String> s = new ArrayList<>();
        try (
                Scanner input = new Scanner(file);

        ) {
            while (input.hasNext()) {
                String a = input.next();
                if (a.toUpperCase() != args[0].toUpperCase()) {
                    s.add(a);
                }

            }


        }

        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < s.size(); i++) {
                output.println(s.get(i));
            }
        }


    }
}
