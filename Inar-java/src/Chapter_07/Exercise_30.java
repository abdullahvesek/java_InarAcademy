package Chapter_07;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of values: ");
        int[] list = new int[input.nextInt()];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println("the list " + (isConsecutive(list) ? "has" : "has not"));


    }


    public static boolean isConsecutive(int[] values) {
       if (values.length<4)
           return false;



        for (int i = 0; i < values.length-4 ; i++) {
            if(values[i]==values[i+1]&&values[i]==values[i+2]&&values[i]==values[i+3])
                return true;
        }
return false;
    }
}