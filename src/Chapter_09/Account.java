package Chapter_09;

import java.util.Date;

public class Account {
    private int id=0;
    private double balance=0;
    private static  double annualInterestRate=0;
    private java.util.Date dateCreated;

    Account(){
        dateCreated=new Date();
    }

public  Account(int id,double balance){
        this.id=id;
        this.balance=balance;
        dateCreated=new Date();
    }
 Date getDateCreated(){
        return dateCreated;
 }

double getAnnualInterstRate(){
        return annualInterestRate;
}
    double getMonthlyInterestRate(){
        return getAnnualInterstRate()/12;
    }

double getMonthlyInterest(){
        return getBalance()*(getMonthlyInterestRate()/100);
}
 public double getBalance(){
        return  balance;
}
public  void withDraw(double amount){
        balance-=amount;
}
void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;

}
int getId(){
        return id;
}
public void deposit(double amount){
        balance+=amount;
}

    public static void main(String[] args) {
        Account account = new Account(1122, 20000);


        account.setAnnualInterestRate(4.5);


        account.withDraw(2500);


        account.deposit(3000);

        System.out.println("\n          Account Statement");
        System.out.println("------------------------------------------");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Date created: " + account.getDateCreated());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.printf("Monthly interest: $%.2f\n",
                account.getMonthlyInterest());
    }


}
