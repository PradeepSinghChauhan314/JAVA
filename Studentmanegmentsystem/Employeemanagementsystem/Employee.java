
public class Employee {
    private int idCard;
    private String name;
    private double salary;
    private String department;
    public Employee( int idCard,String name, double salary, String department) {
        this.idCard = idCard;
        this.name = name;
        this.salary = salary;
        this.department = department;
  }

    public int getIdCard() {
        return idCard;
    }

public String getName() {
    return name;
}
   public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

public String toString() {
    return "ID: " + idCard + " | Name: " + name + " | Salary: $" + salary + " | Dept: " + department;
}
}