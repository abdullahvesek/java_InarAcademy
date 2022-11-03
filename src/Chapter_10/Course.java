package Chapter_10;

public class Course {

        private String courseName;
        private String[] students = new String[1];
        private int numberOfStudents;

        public Course(String courseName) {

            this.courseName = courseName;
        }

        public void addStudent(String student) {
        if (getNumberOfStudents()==students.length){
            String[]temp=new String[(students.length)*2];
            System.arraycopy(students,0,temp,0,students.length);
            students=temp;
        }
         students[getNumberOfStudents()]=student;
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


        public void dropStudent(String student) {
            for (int i = 0; i <students.length ; i++) {
                if (students[i]==student){
                    for (int j = i; j <students.length-1 ; j++) {
                      students[j]=students[j+1];
                    }
                }

            }
         numberOfStudents=getNumberOfStudents()-1;
        }


        private void dropStudent(int index) {

            for (int i = 0; i < index; i++) {
                students[i] = students[i];
            }
            for (int i = index; i < students.length - 1; i++) {
                students[i] = students[i + 1];
            }

        numberOfStudents--;
        }
        public void clear() {
            String []s=new String[1];
            students=s;

        }


        private int findStudent(String student) {
            for (int i = 0; i < numberOfStudents; i++) {
                if (students[i].equals(student)) {
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        Course math101 = new Course("math101");


        math101.addStudent("Mark");
        math101.addStudent("Tom");
        math101.addStudent("Joan");


        math101.dropStudent("Tom");
        math101.dropStudent(0);

        System.out.println("\nThe students in the course " +
                math101.getCourseName() + ":");
        String[] students = math101.getStudents();
        for (int i = 0; i < math101.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }

    }

