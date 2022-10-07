package Chapter_07;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter list 1 length and list1: ");
        int a =input.nextInt();
        int[]list1=new int[a+1];
        list1[0]=a;
        for (int i = 1; i < list1.length ; i++) {
            list1[i]=input.nextInt();

        }
        System.out.println("enter list2 length and list2: ");
        int b = input.nextInt();
        int[]list2=new int[b+1];
        list2[0]=b;
        for (int i = 1; i < list2.length ; i++) {
            list2[i]=input.nextInt();

        }

        System.out.println("the merged list is \n");
merged(list1,list2);


    }

public static void merged(int[]list1,int[]list2){
        int[]list3=new int[list1.length+ list2.length-2];

    for (int i = 0; i < list1.length-1 ; i++) {
        list3[i]=list1[i+1];
    }
    for (int i = list1.length-1, j=1; i <list1.length-1+list2.length-1 ; i++,j++) {
        list3[i]=list2[j];
    }

    Exercise_27.sort(list3);

    for (int e:list3)
        System.out.print(e+" ");




    }



}
