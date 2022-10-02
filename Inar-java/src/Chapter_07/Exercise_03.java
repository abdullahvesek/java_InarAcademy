package Chapter_07;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        System.out.println("enter integer between 0 and 100");

        int []counts=new int[100];

        count(counts);

        for (int i = 0; i < counts.length ; i++) {

            if(counts[i]>0)

            System.out.println(i+1+" occurs "+counts[i]+(counts[i]>1?" times":" time"));
        }

        }
   public static void count(int[]counts){
       Scanner input=new Scanner(System.in);
       int number;
       do{
           number= input.nextInt();;
           if(number>=1 && number<=100) {
               counts[number - 1]++;
           }
           }while(number!=0);

       }
   }





