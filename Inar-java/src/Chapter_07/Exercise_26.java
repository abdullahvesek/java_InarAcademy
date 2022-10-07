package Chapter_07;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter list 1 length and list : ");
       int a= input.nextInt();
        int[]list1=new int[a+1];
        for (int i = 1; i < list1.length ; i++) {
         list1[i]= input.nextInt();
        }

        System.out.println("enter list2 length and list2: ");
    int b= input.nextInt();
    int[]list2=new int[b+1];
        for (int i = 1; i < list2.length ; i++) {
            list2[i]= input.nextInt();
        }

        System.out.println("two list are "+(equals(list1,list2)?"equal":"not equal"));


    }


    public static boolean equals(int[] list1, int[] list2){
        if(list1.length!= list2.length)
            return false;

        for (int i = 1; i < list1.length ; i++) {
            if(list1[i]!=list2[i])
                return false;
        }

    return true;


    }




}
