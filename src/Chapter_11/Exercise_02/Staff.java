package Chapter_11.Exercise_02;

import java.util.Date;

public class Staff extends Employee{
private String title;

    public Staff(String name, String adress, String number, String e_mail, String office, double salary,  String title) {
        super(name, adress, number, e_mail, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

@Override
    public String toString(){
      return   super.toString()+" title "+title;
}
}
