package Chapter_11.Exercise_03;

import Chapter_09.Account;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {

        super(id, balance);
    }
@Override
    public void withDraw(double amount) {
        if (getBalance() > amount) {
            setBalance(getBalance() - amount);
        } else
            System.out.println("you cannot withdraw money because ıt is forbidden boy!!");
    }


    @Override
    public String toString() {
      return   super.toString();
    }
}