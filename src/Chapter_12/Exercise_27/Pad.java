package Chapter_12.Exercise_27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pad {
    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.out.println("must be 1 ");
            System.exit(0);
        }
        ArrayList<File> list = new ArrayList<>();

        addFiles(list, args);
        replaceWords(list);

    }

    private static void replaceWords(ArrayList<File> files) throws FileNotFoundException {
        for (int i = 0; i < files.size(); i++) {
            ArrayList<String> list = new ArrayList<>();

            try (
                    Scanner input = new Scanner(files.get(i));
            ) {
                while (input.hasNext()) {
                    String s = input.nextLine();
                    if (s.contains("Exercise")) {
                        list.add(pad(s));
                    } else
                        list.add(s);
                }
            }

            try (
                    PrintWriter output = new PrintWriter(files.get(i));

            ) {

                for (int j = 0; j < list.size(); j++) {
                    output.println(list.get(j));
                }
            }


        }

    }

    private static String pad(String s) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList(s.split(" ")));
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).matches("Exercise\\d_\\d")) {
                StringBuilder newStr = new StringBuilder(str.get(i));
                newStr.insert(newStr.length() - 1, 0 + "");
                newStr.insert(8, '0');
                str.remove(i);
                str.add(i, newStr.toString());
            }
        }

        String a = "";
        for (int i = 0; i < str.size(); i++) {
            a += str.get(i) + " ";
        }
        return a;
    }


    public static void addFiles(ArrayList<File> list, String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (!args[i].equals("Exercise_12_27.java") &&
                    !args[i].equals("Exercise_12_27.class")) {
                list.add(new File(args[i]));
            }
        }

    }


}
