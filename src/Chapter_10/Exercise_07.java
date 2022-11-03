package Chapter_10;

import Chapter_09.Account;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {

        Account[]list=new Account[10];

        getAcount(list);

         int choice;

         do {
             int id=askId();
             while (id<0 || id>9) {
                 System.out.println("ıt is invalid id please enter id: ");
                 id = askId();

             }
             printMenu();
             do {

                 choice = askChoice();
                 switch (choice) {
                     case 1:
                         System.out.println("the balance is " + list[id].getBalance());
                         printMenu();
                         break;
                     case 2:
                         Scanner input = new Scanner(System.in);
                         System.out.println("enter withdraw: ");
                         double withdraw = input.nextDouble();
                         list[id].withDraw(withdraw);
                         printMenu();
                         break;
                     case 3:
                         System.out.println("enter amount for deposit:");
                         Scanner input2 = new Scanner(System.in);
                         double deposit = input2.nextDouble();
                         list[id].deposit(deposit);
                         printMenu();
                         break;
                 }
             } while (choice != 4 && (choice > 0 && choice < 4));


         }while (true);


        }


public static void getAcount(Account[]list){
    Scanner input=new Scanner(System.in);
    System.out.println("enter ıd for accounts:");
    for (int i = 0; i <list.length ; i++) {
        list[i]=new Account(input.nextInt(), 100);
    }
    }

public static int askId(){
    System.out.println("enter an id");
    Scanner input=new Scanner(System.in);
    int id= input.nextInt();
return id;
    }

public static void printMenu(){
    System.out.println("Main menu\n" +
            "1: check balance\n" +
            "2: withdraw\n" +
            "3: deposit\n" +
            "4: exit");
}

public static int askChoice(){
    Scanner input=new Scanner(System.in);
        System.out.println("enter choice:");
    int choice=input.nextInt();
    return choice;
    }

}
