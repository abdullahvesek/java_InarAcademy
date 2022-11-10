package Weeks.week8;
import java.util.Scanner;
public class IsRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1 = input.nextLine();

        System.out.println("Enter the  string: ");
        String s2 = input.nextLine();

        boolean result = isRotationOnAnother(s1, s2);
        System.out.println(result);
    }

    public static boolean isRotationOnAnother(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
String news=s1+s1;
        if (!(news.contains(s2)))
            return false;
        else
            return true;
    }
}
