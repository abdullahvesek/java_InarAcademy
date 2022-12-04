package Chapter_mixed;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise7_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 numbers");

        Set<Integer>list=new HashSet<>();
        for (int i = 0; i <10 ; i++) {
            list.add(input.nextInt());
        }

        System.out.println(Arrays.toString(list.toArray()));

    }
}
