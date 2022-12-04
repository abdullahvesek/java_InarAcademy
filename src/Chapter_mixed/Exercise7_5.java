package Chapter_mixed;

import java.util.*;

public class Exercise7_5 {
    public static void main(String[] args) {
        Set<Integer> list=new HashSet<>();
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 numbers ");
        for (int i = 0; i <10 ; i++) {
          int k=input.nextInt();

            list.add(k);
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
