package Weeks.week9;
import java.util.Scanner;
public class Reversed {
    public static void main(String[] args) {


        int[] arr = getFromUser();

        System.out.println("Before reverse method:");
        displayArray(arr);


        reversed(arr);

        System.out.println("\nAfter reverse method:");
        displayArray(arr);



    }


    public static void reversed(int[] arr) {


        for (int arrIndex = 0, reversedArrIndex = arr.length - 1; arrIndex < arr.length / 2; arrIndex++, reversedArrIndex--) {
            int temp = arr[reversedArrIndex];
            arr[reversedArrIndex] = arr[arrIndex];
            arr[arrIndex] = temp;
        }

    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\n");
    }

    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] list = new int[10];

        for (int n = 0; n < list.length; n++) {
            list[n] = input.nextInt();
        }

        return list;
    }
}
