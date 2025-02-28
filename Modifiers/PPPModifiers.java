class Parent{
    public String fname="Pradeep";//public is accessible to anywhere
    private String fnamepraivate="Jone";//private is accessible only in this class
    protected String fnameprotected="deepak";//protected is accessible in this class and its subclass
    String defaultvar="Default variable";//default is accessible in this class and its subclass

    public void myPublicMethod(){//public is accessible to anywhere
        System.out.println("I am a public method");
    }
    private void myPrivateMethod(){//Private is accessible only in class
        System.out.println("I am a Private method");
}
protected void myProtectedMethod(){
    System.out.println("I am a Protected method");

}
 void mydefaultMethod(){
    System.out.println("I am a default method");
 }
}
public class PPPModifiers {
    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.myPublicMethod();
    
    
    System.out.println(obj.fname);
    System.out.println(obj.fnameprotected);

    }
}
    

