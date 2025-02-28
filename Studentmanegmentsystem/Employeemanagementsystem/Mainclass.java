import java.util.Scanner;
public class Mainclass{
        public static void main(String[] args) {
        EmployeeManager manager=new EmployeeManager();
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
            int salary=scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n Enter Employee department.");
            int department=scanner.nextInt();
            scanner.nextLine();
        
             case 2:
             manager.viewEmployees();
             break;
             case 3:
             System.out.println("Enter Idcard No. to Search:");
             int SearchId=scanner.nextInt();
             manager.searchEmployees(SearchId );
             break;
             case 4:
             manager.sortByName();
             manager.viewEmployees();
             break;
             case 5:
             manager.sortBySalarys();
             manager.viewEmployees();
             break;
             case 6:
             System.out.println("Enter Idcard No. to delete:");
             int deleteId=scanner.nextInt();
             manager.deleteEmployee(deleteId);
             break;
             case 7:
             System.out.println("Exiting Program...");
             scanner.close();
             return;
             default:
             System.out.println("Invailid choice try again.");



        }
        
    }
    
    }
}

