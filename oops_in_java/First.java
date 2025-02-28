public class First {
    final int x=5;//final keyword is fix the value of variable
    String s= "Hello";
    double y=-1.2;
    public static void main(String[] args){
        First obj = new First();
        First obj1 =new First ();
        Second sobj=new Second();
        obj.y=5.4;
        System.out.println(obj.y);
        System.out.println(sobj.a);
        System.out.println(obj.x);
        System.out.println(obj.s);

    }
    
}
