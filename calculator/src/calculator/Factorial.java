package calculator;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int X=1;
		for (int i=1;i<=n;i++)
		{
		   X=X*i;
		}
		System.out.println("the factorial is:"+X);
		
		
		
	}

}
