package Chapter_11.Exercise_05;

public class Test_05 {
    public static void main(String[] args) {


        Course course1 = new Course("Aerospace ");
        Course course2 = new Course("java");

        course1.addStudent("Abdullah Vesek");
        course1.addStudent("Mauro Icardi");
        course1.addStudent("Mertens");

        course2.addStudent("Fernando Muslera");
        course2.addStudent("Sacha Boey");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
    }
}
