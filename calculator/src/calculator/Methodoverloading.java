package calculator;

public class Methodoverloading {
	static int area (int a)
	{
		return a*a;
	}
	static int area (int a,int b)
	{
		return a*b;
	}
	static double area (double r)
	{
		return Math.PI*r*r;
	}
     public static void main(String[] args) {
    	 int square=area(4);
    	 int rectangle=area(2,5);
    	 double circle=area(2.5);
    	 System.out.println(square+ "area of square");
    	 System.out.println(rectangle+ "area of rectangle");
    	 System.out.println(circle+ "area of circle");
     }
     
}
