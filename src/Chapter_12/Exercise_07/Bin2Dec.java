package Chapter_12.Exercise_07;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a binary string ");
        String s = input.nextLine();

        try {
            System.out.println("the demical value of " + s + " is " + demicalValue(s));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }


    }

    private static int demicalValue(String s) throws NumberFormatException {
        int demical = 0;
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (s.charAt(i) > 1 || s.charAt(i) < 0)
                throw new NumberFormatException("the format is not good ");
            demical += (Integer.parseInt(String.valueOf(s.charAt(i)))) * Math.pow(2, j);

        }
        return demical;
    }


}
