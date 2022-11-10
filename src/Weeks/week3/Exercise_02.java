package Weeks.week3;
import java.util.Scanner;
public class Exercise_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 ages for sorting :  ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int temp;


        if(a > b){
            temp = b ;
            b = a ;
            a = temp ;
        }if(b > c){
            temp = c ;
            c = b ;
            b = temp ;
        }if(a > b){
            temp = b ;
            b = a ;
            a = temp ;
        }

        System.out.println("The youngest person is at the " + a + " age");
        System.out.println("The oldest person is at the " + c + " age");
    }
}
