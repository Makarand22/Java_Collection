package ArrayList.Student;

public class Student {

    private StudentDTO studentDTO;

    //Constructor
    public Student ( String firstName, String lastName, String studentId, int age){
        this.studentDTO = new StudentDTO(firstName,lastName,age,studentId);
    }

    public String getFisrtName() {
        return studentDTO.getFirstName();
    }
    public String getLastName() {
        return studentDTO.getLastName();
    }
    public String getStudentId() {
        return studentDTO.getStudentId();
    }
    public int getAge() {
        return studentDTO.getAge();
    }

    public void displayStudents() {
        System.out.println("First Name: " + getFisrtName() + "Last Name: " + getLastName() + "Age: " + getAge() + "Id: " + getStudentId() );
    }


}
