package Chapter_07;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 number: ");
            int[]list1=new int[10];

        for (int i = 0; i <10 ; i++) {
            list1[i]=input.nextInt();
        }
    reverse(list1);




    }

public static void reverse(int[]list){
   int[]list2=new int[list.length];


    for (int i = 0; i < list.length ; i++) {
        list2[list.length-i-1]=list[i];

    }

    for (int i = 0; i <list2.length ; i++) {
        System.out.print(list2[i]+" ");
    }

    }

}
