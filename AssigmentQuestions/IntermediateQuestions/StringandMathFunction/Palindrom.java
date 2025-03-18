package StringandMathFunction;
import java.util.Scanner;

public class Palindrom {
    	public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a String");
	String str=sc.nextLine();
	str=str.toLowerCase();
	str=str.replaceAll("\\s","" );
	if(isPalindrome(str)){
		System.out.println("The String is a palindrom.");
	}
	else{
		System.out.println("The String is not a palindrom.");
	}
	sc.close();	
}
public static boolean isPalindrome(String str){
	int left=0;
	int right =str.length()-1;
	while(left<right){
		if (str.charAt(left)!=str.charAt(right)){
			return false;
		}
		left++;
		right--;
	}
	return true;
}
}