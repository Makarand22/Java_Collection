package ArrayList.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LogicClass {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // Add new employees to the list
        employees.add(new Employee("EMP12", "John", 60000.0));
        employees.add(new Employee("EMP23", "Fredy", 70000.0));
        employees.add(new Employee("Emp34", "Alice", 45000.0));
        employees.add(new Employee("Emp45", "Bob", 55000.0));

        System.out.println("\nEmployee List before filter: ");
        employees.forEach(System.out::println);
        //System.out.println("Employee List before filter: " + employees);

        List <Employee> filteredEmp = employees.stream()
                .filter( employee -> employee.getSalary() > 50000 && employee.getSalary() < 700000)
                .collect(Collectors.toList());

        System.out.println("\nEmployee Filtered with salary: ");
        filteredEmp.forEach(System.out::println);
        //System.out.println("Employee Filtered with salary: " + filteredEmp);

    }
}
