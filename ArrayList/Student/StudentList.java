package ArrayList.Student;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Makarand", "Baviskar" ,"ST123", 25));
        students.add(new Student("Pratik", "Jangam", "ST342", 24));
        students.add(new Student("Sourabh", "Chourey" ,"ST133", 29));
        students.add(new Student("Amol", "Sapkal", "ST242", 23));
        students.add(new Student("Sayali", "Chande" ,"ST423", 23));
        students.add(new Student("Atharva", "Patil", "ST343", 29));

        for (Student student : students) {
            student.displayStudents();
        }
    }
}
