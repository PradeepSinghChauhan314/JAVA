
import stringutils.StringUtils;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        scanner.close();
        if (PalindromeChecker.Palindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println( "\"" + input + " \" is not a palindrome.");
        }
    }
}
