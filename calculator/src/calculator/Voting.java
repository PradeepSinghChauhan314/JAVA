package calculator;
import java.util.*;
public class Voting {
	public static void main(String[] args) {
		Scanner age=new Scanner(System.in);
	System.out.println("Enter the age:");
	int n=age.nextInt();
	int a=18;
	if(n>=a) {
		System.out.println("Eligible for voting");
	}
	else {
		System.out.println("Not eligible for voting");
	}
	}
}
