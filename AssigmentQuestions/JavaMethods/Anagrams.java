package JavaMethods;
import java.util.Arrays;

public class Anagrams {
    public static boolean theAnagrams(String str1,String str2){
        if (str1.length()!=str2.length()){
            return false;

        }
       
        char []charArray1=str1.toCharArray();
        char []charArray2=str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        if(theAnagrams(str1, str2)){
            System.out.println(str1 + " "+ "and " +" "+ str2 + " "+" are anagrams. " );
        }
        else{
            System.out.println(str1 + " " +"and " +" "+ str2 +" "+ " are not anagrams. " );
        }
    }
}
