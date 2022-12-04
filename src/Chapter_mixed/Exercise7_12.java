package Chapter_mixed;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("enter 10 number ");
        for (int i = 0; i <10 ; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list.toString());

        System.out.println("---------------------1");
        for (int i = list.size()-1;i>=0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
