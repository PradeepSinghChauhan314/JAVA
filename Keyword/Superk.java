 class Parent{
    //instance variable
    int a=10;
    //Static variable
    static int b=20;
    
}
public class Superk extends Parent{
    void rr(){
        super.a=700;
        System.out.println(super.a);
        Parent.b=100;//class name to print static variable by super keyword
        System.out.println(super.b);
    }
    public static void main(String[] args) {
      //  super.a=700;
        //super.b=100;
        new Superk().rr();
    }

}
