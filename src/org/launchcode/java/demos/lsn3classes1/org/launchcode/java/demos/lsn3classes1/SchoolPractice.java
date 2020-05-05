import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student student1 = new Student("Manny",123,1,4.0);
        Student student2 = new Student("Jane",456,1,3.9);
        Student student3 = new Student("Bobby",789,1,2.5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Teacher instructor = new Teacher("John","Wick","Gun Control", 10);

        Course course = new Course(instructor.getSubject(),101,instructor,students);

        //Print class roster
        System.out.println("Course: " + course.getCourseName() +" (" + course.getCourseId() + ")");
        System.out.println("Instructor: " + course.getInstructor().getFullName() + " (Experience: " + course.getInstructor().getYearsTeaching() + " Years.)");
        System.out.println("Students Enrolled:");
        System.out.println("ID. \tName. \tCredits. \tGPA");

        for (int i = 0; i < course.getStudent().size(); i++) {
            Student temp = course.getStudent().get(i);
            System.out.println(temp.getStudentId()+"\t\t"+temp.getName()+"\t\t"+temp.getNumberOfCredits()+"\t\t"+temp.getGpa());
        }
    }
}
