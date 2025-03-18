class One {
    public void first(){
    System.out.println("Pradeep");
    }
    
}
 class Two extends One {
    public void second(){
        System.out.println("Singh");
    }
}
class Three extends Two {
    public void thred(){
System.out.println("Chauhan");
    }
}
public class Multilevel {
    public static void main(String[] args) {
      Three T=new Three();  
      T.second();
      T.first();
      T.thred();
    }

    
}
