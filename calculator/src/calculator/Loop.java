package calculator;
import java.util.*;
public class Loop {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int x=0;
		int a=0;
		int b=1;
		while(x<=n) {
			int c=a+b;
		System.out.println(c);
		x++;
		a=b;
		b=c;
		
	}
	}

}
