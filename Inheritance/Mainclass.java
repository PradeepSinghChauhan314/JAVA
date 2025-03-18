import java.util.*;
 class Car {
String brandname;
String model;

Car(String brandname ,String model)
    {
        this.brandname=brandname;
        this.model=model;
    System.out.println("brandname : " +brandname); 
    System.out.println("Modal:" +model); 

    }

    
}
class Newcar extends Car{
    int MFyear;
    Newcar(String brandname, String model, int MFyear){
        super(brandname, model);
        System.out.println("MFyear : " +MFyear);
    }
}

class Mainclass{
    public static void main(String[] args) {
        Newcar N= new Newcar("Toyota","Corolla",2022);
    }
}
