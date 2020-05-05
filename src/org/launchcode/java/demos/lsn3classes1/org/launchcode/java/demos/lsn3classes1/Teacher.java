public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }
    protected void setSubject(String subject) {
        this.subject = subject;
    }
    protected void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
    protected String getFirstName() {
        return firstName;
    }
    protected String getLastName() {
        return lastName;
    }
    protected String getFullName() {
        return firstName + " " + lastName;
    }
    protected String getSubject() {
        return subject;
    }
    protected int getYearsTeaching() {
        return yearsTeaching;
    }

    protected Teacher(String firstName, String lastName, String subject, int yearsTeaching){
        setFirstName(firstName);
        setLastName(lastName);
        setSubject(subject);
        setYearsTeaching(yearsTeaching);
    }
}

