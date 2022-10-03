package Chapter_07;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 number: ");
        int[]list=new int[10];

        for (int i = 0; i <10 ; i++) {
            int a= input.nextInt();
            list[i]=a;
        }

        System.out.println("the smallest elemnet's index is : "+smallest(list));

    }

   public static int smallest(int[]list){
        int min=list[0];
        int minIndex=0;

       for (int i = 1; i < list.length ; i++) {
           if(list[i]<min){
               min=list[i];
               minIndex=i;
           } else if (list[i]==min) {
               min=min;
               minIndex=minIndex;

           }


       }
       return minIndex;

   }


    }

