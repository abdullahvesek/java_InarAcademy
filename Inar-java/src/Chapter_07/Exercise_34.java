package Chapter_07;

import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a string: ");
        String s= input.next();

        System.out.println("the sorted string is. " + sort(s));



    }

public static char[] sort(String s){
        char[]ch=new char[s.length()];

    for (int i = 0; i < ch.length ; i++) {
        ch[i]=s.charAt(i);
    }

    for (int i = 0; i < ch.length-1 ; i++) {
        char min=ch[i];
        int minIndex=i;

        for (int j = i+1; j <ch.length ; j++) {
            if (ch[j]<min){
                min=ch[j];
                minIndex=j;

            }
        }

   if (minIndex!=i){
       ch[minIndex]=ch[i];
       ch[i]=(char) min;

   }

    }

return ch;
    }




}
