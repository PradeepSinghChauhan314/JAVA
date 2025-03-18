import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;
 interface One {
   public void first();
}
interface Two {
    public void second();
 }
 interface Three extends One,Two {
    public void first();
 }
 class Child implements Three{
    @Override public void first(){
    System.out.println("First");
    }
    public void second(){
        System.out.println("Second");
    }  
 }
 
public class Multipel {
    public static void main(String[] args) {
        Child c=new Child();
        c.first();
        c.second();
        c.first();
        
    }
}
