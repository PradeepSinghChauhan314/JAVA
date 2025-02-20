package hello;

public class hellooworld{
	public String name;
	public int age=23;
	public hellooworld() {
		this.name="deepak";
	}
	public static void main(String[]args) {
		hellooworld d = new hellooworld();
		System.out.println("student name:" +d.name);
		System.out.println(+d.age);
		
	}
}