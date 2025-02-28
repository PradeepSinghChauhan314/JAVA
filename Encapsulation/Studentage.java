public class Studentage {
    private String Name;
    private int age;

    public String getName(){
        return Name;
    }
    public int getage(){
        return age;
     }
     public void setName(String newName){
        this.Name=newName;
     }
    public void setage(int newage){
        this.age=newage;
    }
    public void vote(int age)
    if(age>=18)
    {
        System.out.println("Eligible for voting");
    }
    else{
        System.out.println("Not Eligible for voting");
    }
}
