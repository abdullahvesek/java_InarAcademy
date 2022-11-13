package Chapter_11.Exercise_02;

import Chapter_10.MyDate;

import java.util.Date;

public class Test_Exercise_02 {
    public static void main(String[] args) {

        Employee employee=new Employee("abdullah","kayseri","5116776153","vesek@gmail.com","hunat",2500000);
        Person person=new Person("abdullah","kayseri","5516776153","vesek@gmail.com");
        Student student=new Student("abdullah","kayseri","5516776153","vesek@gmail.com",3);
        Faculty faculty=new Faculty("abdullah","kayseri","5516776153","vesek@gmail.com","hunat",2500000,45,"major");
        Staff staff=new Staff("abdullah","kayseri","55525263650","vesek@gmail.com","hunat",522222,"roll");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
