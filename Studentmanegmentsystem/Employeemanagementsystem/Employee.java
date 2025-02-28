
public class Employee {
    private String name;
    private String idCard;
    private double salary;
    private String department;
    public Employee(String name, String idCard, double salary, String department) {
        this.name = name;
        this.idCard = idCard;
        this.salary = salary;
        this.department = department;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    
    public void setDepartment(String department) {
        this.department = department;
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID Card: " + idCard);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("No detial of employee");
    }
}
