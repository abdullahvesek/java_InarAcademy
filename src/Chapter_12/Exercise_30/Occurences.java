package Chapter_12.Exercise_30;

import java.io.File;
import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a file name ");
        String name = input.nextLine();

        File file = new File(name);
        if (!file.exists()) {
            System.out.println("File " + file.getName() + " does not exist");
            System.exit(0);
        }

        int[] count = new int[26];

        try (
                Scanner inp = new Scanner(file);
        ) {
            while (inp.hasNext()) {
                String s = input.next();
                String str = s.toUpperCase();
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isLetter(str.charAt(i))) {
                        count[((int) str.charAt(i)) - 65]++;
                    }
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println("Number of " + (char) ('A' + i) + "\'s: " + count[i]);
        }

    }
}
