package Chapter_07;

import java.util.Scanner;

public class Exercise_14 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 integer: ");

    int[]numbers=new int [5];
        for (int i = 0; i <5 ; i++) {
            numbers[i]=input.nextInt();

        }
        System.out.println("the gcd of theese numbers is  "+gcd(numbers));
    }

public static int gcd(int...numbers){
        int gcd=1;
        boolean isGcd;
    for (int i = 2; i <min(numbers) ; i++) {
        isGcd=true;

        for (int j = 0; j <numbers.length ; j++) {
            if(numbers[j]%i!=0)
           isGcd=false;
        }
       if(isGcd)
           gcd=i;

    }
return gcd;


    }

public static int min (int...numbers){
        int min=numbers[0];
    for (int i = 1; i <numbers.length ; i++) {
        if(numbers[i]<min)
            min=numbers[i];

    }
return min;

    }



}
