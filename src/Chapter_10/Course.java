package Chapter_10;

public class Course {

        private String courseName;
        private String[] students = new String[1];
        private int numberOfStudents;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void addStudent(String student) {


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


        public void dropStudent(String student) {

        }


        private void dropStudent(int index) {

        }


        public void clear() {

        }


        private int findStudent(String student) {
            for (int i = 0; i < numberOfStudents; i++) {
                if (students[i].equals(student)) {
                    return i;
                }
            }
            return -1;
        }
    }

