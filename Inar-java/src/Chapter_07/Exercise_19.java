package Chapter_07;

import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number ");
        int a =input.nextInt();
        int[]list=new int[a+1];
        list[0]=a;
        System.out.println("enter list");

        for (int i = 1; i < list.length ; i++) {
            list[i]=input.nextInt();
        }

        System.out.println("the lsit is "+(isSorted(list)?"already sorted":"not sorted"));


    }

public static boolean isSorted(int[]list){

    for (int i = 1; i < list.length-1 ; i++) {
      if(list[i]>list[i+1])
          return false;
    }
return true;


    }



}
