package Chapter_10;

import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

   public MyDate(){
        GregorianCalendar calendar=new GregorianCalendar();
        this.day=calendar.get(GregorianCalendar.DAY_OF_MONTH);
        this.month=calendar.get(GregorianCalendar.MONTH);
        this.year=calendar.get(GregorianCalendar.YEAR);

    }
public  MyDate(long elapsed){
        GregorianCalendar calendar=new GregorianCalendar();
        calendar.setTimeInMillis(elapsed);
    year = calendar.get(GregorianCalendar.YEAR);
    month = calendar.get(GregorianCalendar.MONTH);
    day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
}

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

public void setDate(long elapsed){
    GregorianCalendar calendar=new GregorianCalendar();
    calendar.setTimeInMillis(elapsed);
    year = calendar.get(GregorianCalendar.YEAR);
    month = calendar.get(GregorianCalendar.MONTH);
    day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
}

    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("Date1: " + date1.getMonth() + "/" + date1.getDay() +
                "/" + date1.getYear());
        System.out.println("Date2: " + date2.getMonth() + "/" + date2.getDay() +
                "/" + date2.getYear());
    }
}
