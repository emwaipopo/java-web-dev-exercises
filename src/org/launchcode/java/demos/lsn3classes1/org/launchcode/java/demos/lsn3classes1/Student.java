public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    protected void setName(String name){
        this.name = name;
    }
    protected void setStudentId(int studentId){
        this.studentId = studentId;
    }
    protected void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }
    protected void setGpa(double gpa){
        this.gpa = gpa;
    }
    protected String getName(){
       return this.name;
    }
    protected int getStudentId(){
        return this.studentId;
    }
    protected int getNumberOfCredits(){
        return this.numberOfCredits;
    }
    protected double getGpa(){
        return this.gpa;
    }

    protected Student(String name, int studentId, int numberOfCredits, double gpa){
        setName(name);
        setStudentId(studentId);
        setNumberOfCredits(numberOfCredits);
        setGpa(gpa);
    }

}