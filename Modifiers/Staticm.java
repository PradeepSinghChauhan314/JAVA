public class Staticm {
    static void mystaticMethod(){
        System.out.println("Static Method");
    }
    public void mypublicMethod(){
        System.out.println("Public Method");

    }
    public static void main(String[] args) {
        mystaticMethod();//this method is called directiy because it is declared as static
        //mypublicMethod(); This will give the error because this is declared as public so we can not access this method
        Staticm s =new Staticm();
        s.mypublicMethod();
    }
}
