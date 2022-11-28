package rick.StringsLearn;

import java.util.Arrays;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String testString = "output";
        System.out.println(maxOccuring(testString));

    }
    public static char maxOccuring(String str){
        int[] count = new int[26];
        Arrays.fill(count, 0);
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                count[ch-'a'] += 1;
            }
            else{
                count[ch-'A'] += 1;
            }
        }
        int max = 0;
        char maxChar = '\0';
        for(int i = count.length-1; i >= 0; i--){
            if(max <= count[i]){
                max = count[i];
                maxChar = (char) ('a' + i);
            }
        }
        return maxChar;
    }
}
