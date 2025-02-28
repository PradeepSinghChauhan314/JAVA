public class Thisk {
    String name;
    Thisk(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Student Name:" +this.name);
    }
    public static void main(String[] args) {
        Thisk s=new Thisk("Pradeep");
        s.display();
    }
    
}
