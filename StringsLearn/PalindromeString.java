package rick.StringsLearn;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome("5?36@6?35"));
    }
    public static boolean isPalindrome(String s){
        if(s == null || s.length()==0 || s.length()==1){
            return true;
        }
        s = s.toLowerCase();
        int str = 0, e = s.length()-1;
        while(str <= e){
            if(s.charAt(str++)!=s.charAt(e--)){
                return false;
            }
        }
        return true;
    }
}
