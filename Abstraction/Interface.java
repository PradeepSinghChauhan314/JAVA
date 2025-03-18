 interface Shape {
    double area();  //Constructer 
}
 class Circle implements Shape {
    double r;
    public Circle(double r){//Method
        this.r=r;
    }
    public double area (){
        return Math.PI*Math.pow(r, 2);
    }
}
class Rectangle implements Shape{
    double length,width;
    public Rectangle(double length,double width){//Method
        this.length=length;
        this.width=width;
    }
    public double area (){
        return length*width;
}
}
public class Interface {
    public static void main(String[] args) {
        Circle c=new Circle(2.5);
        Rectangle s=new Rectangle(4, 5);
        System.out.println("Area of circle is:" +c.area());
        System.out.println("Area of Rectangle is:" +s.area());
    }
    }
