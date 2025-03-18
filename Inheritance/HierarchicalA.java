import java.io.InputStream;
import java.util.*;
class Input{
    protected int a,b;
    public void inp(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter tow Numbers:");
a=sc.nextInt();
b=sc.nextInt();
}}
class Add extends Input{
    public int addition(){
        return a + b;
    }
}
class Sub extends Input{
    public int subtraction(){
        return a-b;
    }
}
class Multi extends Input{
  public int multiplication(){
    return a*b;
  }
}
class Divid extends Input{
    public int divesion(){
      return a/b;
    }
}
public class HierarchicalA
 {
public static void main(String[] args) {
    Add a=new Add();
    Sub s=new Sub();
    Multi m=new Multi();
    Divid d=new Divid();

    d.inp();
    //d.divesion();
    System.out.println("Division" +d.divesion());

    a.inp();
    System.out.println("Division" +a.addition());

}
    
}
