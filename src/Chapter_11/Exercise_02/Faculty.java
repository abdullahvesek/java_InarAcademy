package Chapter_11.Exercise_02;

import java.util.Date;

public class Faculty extends Employee{
private int hours;
private String rank;

    public Faculty(String name, String adress, String number, String e_mail, String office, double salary, int hours, String rank) {
        super(name, adress, number, e_mail, office, salary);
        this.hours = hours;
        this.rank = rank;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

@Override
    public String toString(){
        return super.toString()+"hours "+hours+"\nrank "+rank;
}
}
