package Chapter_07;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter number of integer: ");
        int[]list=new int[input.nextInt()];

        for (int i = 0; i <list.length ; i++) {
            list[i]=input.nextInt();
        }


        displayRevers(list);


    }

public static void displayRevers(int[]list){
    for (int i = list.length-1; i >=0 ; i--) {
        System.out.print(list[i]+" ");
    }
}
}
