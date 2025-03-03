import java.util.*;
public class Employeemanager 
{
   private List<Employee> employees = new ArrayList<>();
      public void addEmployee(int idcard,String name,double salary,String department)
      {
         employees.add(new Employee(idcard,name,salary,department));
            System.out.println("Employee added Successfulli!");
         }


 public List<Employee> getAllEmployees(){
   return employees;
 }
 public Employee getEmployeeById(int idcard){
   for(Employee emp:employees){
      if(emp.getIdCard()==idcard){
         return emp;
      }
   }
   return null;
 }
 public void updateSalary(int idCard, double newSalary) {
   Employee emp = getEmployeeById(idCard);
   if (emp != null) {
       emp.setSalary(newSalary);
       System.out.println(" Salary updated!");
   } else {
       System.out.println(" Employee not found!");
   }
}
public void updateDepartment(int idCard, String newDepartment) {
   Employee emp = getEmployeeById(idCard);
   if (emp != null) {
       emp.setDepartment(newDepartment);
       System.out.println(" Department updated!");
   } else {
       System.out.println(" Employee not found!");
   }
}
public void deleteEmployee(int idCard) {
   Employee emp = getEmployeeById(idCard);
   if (emp != null) {
       employees.remove(emp);
       System.out.println(" Employee deleted!");
   } else {
       System.out.println(" Employee not found!");
   }
}


public void sortBySalary() {
   employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
   System.out.println(" Sorted by salary (high to low).");
}

public void sortByName() {
   employees.sort(Comparator.comparing(Employee::getName));
   System.out.println(" Sorted by name .");
}
}
















 