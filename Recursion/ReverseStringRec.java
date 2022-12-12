package rick.Recursion;

import rick.utilities.UFeatures;

public class ReverseStringRec {
    public static void main(String[] args) {
        String s = "I am a human";
        StringBuilder builder = toStringConv(s);
        reverse(builder, 0, s.length()-1);
        System.out.println(builder);

    }
    public static StringBuilder toStringConv(String b){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < b.length(); i++){
            ans.append(b.charAt(i));
        }
        return ans;
    }
    public static void reverse(StringBuilder s, int i, int j){
        if(i > j)return;
        swapString(s, i++, j--);
        reverse(s, i, j);
    }
    public static void swapString(StringBuilder s, int a, int b){
        char temp = s.charAt(a);
        s.setCharAt(a, s.charAt(b));
        s.setCharAt(b , temp);
    }
}
