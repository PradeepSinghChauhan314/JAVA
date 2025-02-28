import java.util.*;
public class Employeemanager 
 {
 private List<Employee> Employee = new ArrayList<>();
public Employeemanager(){
}
    public void addEmployee(String var1,String var2,double var3,String var4)
 {
    this.Employee.add(new Employee(var1,var2,var3,var4));
    System.out.println("EMployee added Successfulli");
 }
   public void viewEmployee() {
    if (this.Employee.isEmpty()) {
       System.out.println("There is no employee record");
    } else {
        var1 = this.Employee();

       while(var1.hasNext()) {
          Employee var2 = (Employee)var1.next();
          var2.displayEmployeeDetails();
       }

    }
 }

 public void searchEmployees(int var1) {
     var2 = this.Employee.iterator();
     var3 = this.Employee.iterator();
    Employee var4;
    do {
       if (!var2.hasNext()) {
          System.out.println("Employee not found");
          return;
       }

       var3 = (Employee)var2.next();
    } while(var3.getIdCard() != var1);

    var3.displayEmployeeDetails();
 }

 public void sortByName() {
    this.Employee.sort(Comparator.comparing(Employee::getName));
    System.out.println("Employee sorted by name");
 }

 public void sortBySalarys() {
    this.Employee.sort(Comparator.comparingInt(Employee::getSalary));
    System.out.println("Employee sorted by Salary");
 }

 public void sortByIdcard() {
    this.Employee.sort(Comparator.comparingInt(Employee::getIdCard));
    System.out.println("Employee sorted by idcard");
 }
 public void sortByDepartment(){
    this.Employee.sort(Comparator.comparingInt(Employee::getDepartment));
    System.out.println("Employee sorted by department");
 }

 public void deleteEmployee(int var1) {
    this.Employee.removeIf((var1x) -> {
       return var1x.getIdCard() == var1;
    });
    System.out.println("Employee removed successfully");
 }
}
