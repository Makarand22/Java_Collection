package ArrayList.Student;

public class StudentDTO {

    private String firstName;
    private String LastName;
    private int age;
    private String studentId;

    public int getAge() {
        return age;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return LastName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.LastName = lastName;
    }
    public void setAge (int age) {
        this.age = age;
    }

    public StudentDTO (String firstName, String lastName, int age, String studentId) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }
}



