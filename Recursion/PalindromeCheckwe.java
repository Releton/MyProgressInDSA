package rick.Recursion;

public class PalindromeCheckwe {
    public static void main(String[] args) {
        String s = "wow";
        String s1 = "hello";
        System.out.println("S1 is palindrome = "+isPalindrome(s1, 0));
        System.out.println("S is palindrome = "+isPalindrome(s, 0));
    }
    public static boolean isPalindrome(String s, int i){
        int j = s.length()-i-1;
        if(i > j)return true;
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return isPalindrome(s, i + 1);
    }
}
