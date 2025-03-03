import java.util.Scanner;
public class Mainclass{
        public static void main(String[] args) {
        Employeemanager manager=new Employeemanager();
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("\n Employee Management System");
            System.out.println("\n 1. Add employee");
            System.out.println("\n 2. View all Employees");
            System.out.println("\n 3.Search Employee by Idcard ");
            System.out.println("\n 4. Sort Employee By Name");
            System.out.println("\n 5.Sort Employee By Salarys ");
            System.out.println("\n 6.Sort Employee By Idcard");
            System.out.println("\n 7.Delete Employee Record");
            System.out.println("\n Exit");
            System.out.println("\n Enter your Choice:");
         int choice=scanner.nextInt();
         switch(choice){
            case 1:
            System.out.println("\n Enter Employee Idcard No.");
            int idcard=scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n Enter Employee Name");
            String name= scanner.nextLine();
            scanner.nextLine();
            System.out.println("\n Enter Employee salary.");
            double salary=scanner.nextDouble();
            scanner.nextLine();
            System.out.println("\n Enter Employee department.");
            String department=scanner.nextLine();
            manager.addEmployee(idcard , name, salary, department);
            break;
             case 2:
             System.out.println(" Employee List ");
             for(Employee emp :manager.getAllEmployees()){
                System.out.println(emp);
             }
             break;
             case 3:
             System.out.println("Enter Idcard No. to Search:");
             int SearchId=scanner.nextInt();
             Employee emp=manager.getEmployeeById(SearchId );
             if (emp!=null){
                System.out.println("Found;" +emp);
             }
             else{
                System.out.println("Employee not found!");
             }
             break;
             case 4:
             System.out.print("Enter Emp ID to update salary: ");
             int updateId = scanner.nextInt();
             System.out.print("Enter new Salary: ");
             double newSalary = scanner.nextDouble();
             manager.updateSalary(updateId, newSalary);
             break;

         case 5:
             System.out.print("Enter Emp ID to update department: ");
             int updateDeptId = scanner.nextInt();
             scanner.nextLine(); 
             System.out.print("Enter new Department: ");
             String newDepartment = scanner.nextLine();
             manager.updateDepartment(updateDeptId, newDepartment);
             break;

         case 6:
             System.out.print("Enter Emp ID to delete: ");
             int deleteId = scanner.nextInt();
             manager.deleteEmployee(deleteId);
             break;

         case 7:
             manager.sortBySalary();
             break;

         case 8:
             manager.sortByName();
             break;

         case 9:
             System.out.println("Exiting... ");
             scanner.close();
             System.exit(0);

         default:
             System.out.println(" Invalid choice! Try again.");
     }
 }
}
}  