public class ClassMethods
{
 static void myMethod(){
    //ststic method can be accessed without creating an object
    System.out.println("I am a static method");
 }
 //public method - it can be accessed without creating an object of a class
 public void myPublicMethod(){
    System.out.println("I am a public method");
 }
 public static void main(String [] aegs)
{
    myMethod();
    //myPublicMethod(); can not be accessed directly
  ClassMethods obj =new ClassMethods();
  obj.myPublicMethod();
}
}