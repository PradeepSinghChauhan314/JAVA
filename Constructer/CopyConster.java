public class CopyConster {
    String Name;
    int age;
    //constructer
    CopyConster(String n,int a){
        this.Name=n;
        this.age=a;
    }
    CopyConster(CopyConster c){
        this.Name=c.Name;
        this.age=c.age;
    }
    void display(){
        System.out.println("Name:"+Name + ",Age:"+age  );
    }
    public static void main(String[] args) {
        CopyConster C1 =new CopyConster("Pradeep",23);
    CopyConster C2 =new CopyConster(C1);

    C1.display();
    C2.display();
    }
}
