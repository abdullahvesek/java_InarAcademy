package Chapter_09;

import java.util.Date;

public class Datee {
    public static void main(String[] args) {

        for (int i = 1000; i <100000000 ; i*=10) {
            Date date1 = new Date(i);
            System.out.println("the time is "+date1.toString());
        }
    }
}
