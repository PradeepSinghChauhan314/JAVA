import java.util.*;
public class Studentmaneger {
    private List<Student> students=new ArrayList<>();
    public void addStudent(int rollNumber,String name, int [] marks){
        students.add(new Student(rollNumber,name ,marks));
        System.out.println("Student added Successfully");
    }
    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("There is no student record");
            return;
        }
    for(Student student:students){
        student.displayStudent();
    }
    }
    public void searchStudents(int rollNumber)
    {
        for (Student student :students){
            if(student.getRollNumber()==rollNumber)
        {
            student.displayStudent();
            return;
        }
        }
        System.out.println("Student not found");

    }
    public void sortByName(){
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Student sorted by name");
    }
    public void sortByMarks(){
        students.sort(Comparator.comparingInt(Student::getTotalMarks).reversed());
        System.out.println("Student sorted by marks");
    }
    public void sortByRollnumber(){
        students.sort(Comparator.comparingInt(Student::getRollNumber));
    System.out.println("Student sorted by rollnumber");
    }
    public void deleteStudent(int rollNumber){
        students.removeIf(student -> student.getRollNumber()==rollNumber);
        System.out.println("Student removed successfully");
    }

}
