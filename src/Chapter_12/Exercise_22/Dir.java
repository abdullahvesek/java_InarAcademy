package Chapter_12.Exercise_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Dir {
    public static void main(String[] args) throws Exception {


        if (args.length != 3) {
            System.out.println("the usage is not godd ");
            System.exit(0);
        }

        File file = new File(args[0]);
        if (!file.isDirectory()) {
            System.out.println("there is no directory ");
            System.exit(1);
        }
        File[] files = file.listFiles();

        for (File e : files)
            replace(e, args);


    }

    private static void replace(File e, String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(e);
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                String s1 = s.replaceAll(args[1], args[2]);
                list.add(s1);
            }
        }

        try (
                PrintWriter output = new PrintWriter(e);
        ) {
            for (int i = 0; i < list.size(); i++) {
                output.print(list.get(i) + " ");

            }

        }


    }


}
