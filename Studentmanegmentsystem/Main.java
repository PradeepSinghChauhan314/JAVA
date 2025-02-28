import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Studentmaneger maneger=new Studentmaneger();
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("\n Student Manegement System");
            System.out.println("\n 1. Add student");
            System.out.println("\n 2. View all Students");
            System.out.println("\n 3.Search Student by Roll Number ");
            System.out.println("\n 4. Sort Student By Name");
            System.out.println("\n 5.Sort Student By Marks ");
            System.out.println("\n 6.Sort Student By ROll Number");
            System.out.println("\n 7.Delete Student Record");
            System.out.println("\n Exit");
            System.out.println("\n Enter your Choice:");
         int choice=scanner.nextInt();
         switch(choice){
            case 1:
                System.out.println("\n Enter Student Roll Number:");
                int rollNumber=scanner.nextInt();
                scanner.nextLine();
                System.out.println("\n Enter Student Name");
                String name= scanner.nextLine();
                System.out.println("\n Enter the number of subjects");
                int numsubject=scanner.nextInt();
                int[] marks=new int [numsubject];
                for(int i=0;i<numsubject;i++)
                { 
                    System.out.println("Enter the marks for subject" +(i+1)+":");
                    marks[i]=scanner.nextInt();
                }
                maneger.addStudent(rollNumber,name,marks);
                break;
        
            case 2:
                maneger.viewStudents();
                break;
            case 3:
                System.out.println("Enter Roll Number to Search:");
                int searchRoll=scanner.nextInt();
                maneger.searchStudents(searchRoll );
                break;
            case 4:
                maneger.sortByName();
                maneger.viewStudents();
                break;
            case 5:
                maneger.sortByMarks();
                maneger.viewStudents();
                break;
            case 6:
                System.out.println("Enter RollNumber to delete:");
                int deleteRoll=scanner.nextInt();
                maneger.deleteStudent(deleteRoll);
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
