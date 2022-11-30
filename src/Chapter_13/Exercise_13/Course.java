package Chapter_13.Exercise_13;

public class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

public Object clone()throws CloneNotSupportedException{
        Course cln=(Course) super.clone();
       cln.students=students.clone();
       return cln;
}

}
