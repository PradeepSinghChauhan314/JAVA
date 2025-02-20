package calculator;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int rev=0,original=num;
	int i=0;
	do {int n=i%10;
	  rev=rev*10+n;
	  n/=10;
	  }
	while(i>0);
	if(original==rev) {
		System.out.println(original+" is a palindrom.");
		}
		
		else {
			System.out.println(original+" is not a palindrom.");
		}	
}
}