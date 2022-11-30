package Chapter_13.Exercise_13;



public class Test_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course c = new Course("math");

        c.addStudent("abdullah ");
        c.addStudent("vesek");
        Course c2= (Course) c.clone();

    }
}