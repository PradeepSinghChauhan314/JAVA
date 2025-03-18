abstract class  Shape  {
    String color;
abstract double area ();// Abstract class method is going to be override
public Shape(String color){//Construcor
    this.color=color;
}
String getcolor(){
    return color;
}    
}
class Circle extends Shape{
    double radius;
    public Circle(String color,double radius){
super(color);
System.out.println("Circle constructor called");
this.radius=radius;
    }
@Override double area(){
return Math.PI*Math.pow(radius, 2);
}
@Override String getcolor(){
    return"Circle color is:"+super.getcolor()+ "Area of circle:"+area();
}
}

class Rectangle extends Shape{
    double length,width;
    public Rectangle(String color,double length,double width){
        super(color);
        System.out.println("Rectangle constructor called");
        this.length=length;
        this.width=width;
    }
    @Override double area(){
        return length*width;
}
@Override String getcolor(){
return "Rectangle color is:"+super.getcolor()+ "area of Rectangle:" +area();
}}

public class Abstract {
    public static void main(String[] args) {
        Shape s1=new Circle("Red", 2.1);
        Shape s2=new Rectangle("Black", 2, 2);
        System.out.println(s1.getcolor());
        System.out.println(s2.getcolor());
    }
    
}
