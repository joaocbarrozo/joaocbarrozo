/**
 * check if string is palindrome
 */

public class palindromeChecker {
    static boolean isPalindrome(String s){
        int n = s.length();

        if (n%2 == 1){
            for (int i = 0; i < n/2; i++){
                if(s.charAt(i) != s.charAt(n-1-i)){
                    return false;
                }
            }
            return true;
        }
        else{
            for (int i = 0; i <= n/2; i++){
                if(s.charAt(i) != s.charAt(n-1-i)){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        if(args.length < 1){
            throw new IllegalArgumentException("Usage: PalindromeChecker <string>");
        }
        
        if(isPalindrome(args[0])){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
