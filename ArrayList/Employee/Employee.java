package ArrayList.Employee;

// write the code using Stream API to filter employee with there salary range between 50000 to 70000
public class Employee {
    private String empId;
    private String empName;
    private Double salary;

    public String getEmpName() {
        return empName;
    }
    public String getEmpId() {
        return empId;
    }
    public Double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee{empId='" + empId + "', empName='" + empName + "', salary=" + salary + "}";
    }

    public Employee(String empId, String empName, Double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}


