package calculator;
import java.util.*;
public class Swicth {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("print a number b/w 1-7: ");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("teusday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("Friday");
		    break;
		case 6:
			System.out.println("saterday");
			break;
		case 7:
			System.out.println("Sunday");
		    	break;
		default:
			System.out.println("No day exist");
		}
			
		
		
	}

}
