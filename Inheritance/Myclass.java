import java.util.*;
 class Student {
 
String name;
String branch;

Student(String name ,String branch)
    {
        this.name=name;
        this.branch=branch;
    System.out.println("name : " +name); 
    System.out.println("branch:" +branch); 

    }

    
}
class Newstudent extends Student{
    String Batch;
    Newstudent(String name, String branch, String Batch){
        super(name, branch);
        System.out.println("Batch : " +Batch);
    }
}

class Myclass{
    public static void main(String[]args){
        Newstudent N=new Newstudent("Pradeep","CSE","2023-2027");
    }
}

    

