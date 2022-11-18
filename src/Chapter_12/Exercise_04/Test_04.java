package Chapter_12.Exercise_04;

public class Test_04 {
    public static void main(String[] args) {
        Loan l1 = new Loan(2, 5, 20);
        try {
            l1.setNumberOfYears(-5);
            l1.setAnnualInterestRate(-12);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
