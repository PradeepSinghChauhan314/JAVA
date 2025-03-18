
package stringutils;

public class StringUtils {
    
    public static boolean Palindrome(String str) {
       // if (str == null || str.isEmpty()) {
          //  return false;
      //  }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
