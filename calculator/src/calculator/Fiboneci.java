package calculator;
import java.util.*;
public class Fiboneci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		
		for(int x=2;x<n;x++) {
		int c=a+b;
		System.out.println(c+ "");
		a=b;
		b=c;
	}
	}
}
