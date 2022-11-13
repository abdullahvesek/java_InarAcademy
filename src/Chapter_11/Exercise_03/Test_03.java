package Chapter_11.Exercise_03;

public class Test_03 {
    public static void main(String[] args) {
        CheckingAccount c=new CheckingAccount(25,25000,100);
        SavingsAccount s=new SavingsAccount(65,10000);

        c.withDraw(5000);
        s.withdraw(100);

        System.out.println(c.toString());
        System.out.println(s.toString());
    }

}
