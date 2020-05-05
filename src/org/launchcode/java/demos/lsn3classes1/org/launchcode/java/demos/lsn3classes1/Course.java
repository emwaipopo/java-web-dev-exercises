import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseId;
    private Teacher instructor;
    private ArrayList<Student> student;

    protected void setCourseName(String courseName){
        this.courseName = courseName;
    }
    protected void setCourseId(int courseId){
        this.courseId = courseId;
    }
    protected void setInstructor(Teacher instructor){
        this.instructor = instructor;
    }
    protected void setStudent(ArrayList<Student> student){
        this.student = student;
    }
    protected String getCourseName(){
        return courseName;
    }
    protected int getCourseId(){
        return courseId;
    }
    protected Teacher getInstructor(){
        return instructor;
    }
    protected ArrayList<Student> getStudent(){
        return student;
    }

    protected Course(String courseName, int courseId, Teacher instructor, ArrayList<Student> student){
        this.courseName = courseName;
        this.courseId = courseId;
        this.instructor = instructor;
        this.student = student;
    }
}
