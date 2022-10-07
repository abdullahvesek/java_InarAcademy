package Chapter_07;

import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 integer: ");
        int[]list=new int[10];
        for (int i = 0; i < list.length ; i++) {
            list[i]= input.nextInt();
        }

        combination(list);

    }

public static void combination(int[]list){
    for (int i = 0; i < list.length ; i++) {
        for (int j = 0; j < list.length ; j++) {
            if (list[i]!=list[j])
            System.out.print(list[i]+" "+list[j]+"\n");
        }
    }
}



}
