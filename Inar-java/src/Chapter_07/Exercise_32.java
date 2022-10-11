package Chapter_07;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter list length: ");
        int length= input.nextInt();

        int[]list=new int[length];

        System.out.println("enter list: ");

        for (int i = 0; i <list.length ; i++) {
            list[i]= input.nextInt();
        }

        sort(list);

        for (int i = 0; i <list.length-1 ; i++) {
            int piv=list[i];
            if(list[i+1]<piv){
                int temp;
                temp=list[i+1];
                list[i+1]=piv;
                list[i]=temp;
            }




        }

        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i]+" ");
        }
        }


    public static void sort(int[]list){

        for (int i = 1; i < list.length-1 ; i++) {
            int min=list[i];
            int minIndex=i;

            for (int j = i+1; j < list.length ; j++) {
                if (list[j]<min){
                    min=list[j];
                   minIndex=j;
                }
            }

       if(minIndex!=i){
           list[minIndex]=list[i];
           list[i]=min;
       }

        }
    }





}
