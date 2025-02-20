package calculator;
import java.util.*;
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score b/w 1 to 100:");
		int score=sc.nextInt();
		switch(score/10)
		{
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
	    default:
				System.out.println("The studend has fail");
				
		}
	}

}
