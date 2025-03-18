 interface  A{
    void methodA();
}
 interface B extends A {
    void methodB();  
}
 class C implements B  {
    public void methodA(){
        System.out.println("Method of interface A");
    }
    public void methodB(){
        System.out.println("Method of interface B");
    }   
}
public class Hybrid {
    public static void main(String[] args) {
        C obj=new C();
        obj.methodA();
        obj.methodB();
    }
    
}
