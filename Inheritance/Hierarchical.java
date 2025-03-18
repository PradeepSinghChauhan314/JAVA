 class A {
    public void first(){
        System.out.println("Class A");
    }
    
}
 class B extends A{
    public void second(){
        System.out.println("Class B");

    }
}
class C extends A{
    public void thred(){
        System.out.println("Class C");
    }
}
class D extends A{
    public void forth(){
        System.out.println("Class D"); 

    }
}
public class Hierarchical {
    public static void main(String[] args) {
        D d=new D();
        C c=new C();
        B b=new B();
        b.first();
        b.second();
    }

    
}
