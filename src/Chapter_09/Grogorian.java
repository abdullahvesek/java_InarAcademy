package Chapter_09;

import java.util.GregorianCalendar;

public class Grogorian {
    public static void main(String[] args) {
        GregorianCalendar a=new GregorianCalendar();
        System.out.println("the current time is "+a.get(a.YEAR)+" "+a.get(a.MONTH)+" "+a.get(a.DAY_OF_MONTH));

        GregorianCalendar b=new GregorianCalendar();
        b.setTimeInMillis(1234567898765L);
        System.out.print(b.get(b.YEAR)+"  "+b.get(b.MONTH)+" "+b.get(b.DAY_OF_MONTH));
    }

}
