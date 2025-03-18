
package StringandMathFunction;
public class ReverseString {
    public static void main(String[] args) {
        String x="Pradeep singh chauhan";
        String reversStr=reverseString(x);
        System.out.println("Original String:"+x);
        System.out.println("Reversed String:"+reversStr);    
    
    }
    public static String reverseString(String x){
        String reversed="";
        for(int i=x.length()-1;i>=0;i--){
            reversed+=x.charAt(i);
        }
        return reversed;
    }
}
