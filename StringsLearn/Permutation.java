package rick.StringsLearn;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        System.out.println(containsPermutation(s1,s2));
    }
    private static boolean checkEqual(int[] count1, int[] count2){
        for(int i = 0; i < 26; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean containsPermutation(String s1, String s2){
         int[] count = new int[26];
        Arrays.fill(count,0);
        for (int i = 0; i < s1.length(); i++) {
            int ind = s1.charAt(i) - 'a';
            count[ind]++;
        }
        //now traverse s2 string in window of size s1 length and compare
        int i = 0;
        int windowSize = s1.length();
        int[] count2 = new int[26];
        Arrays.fill(count2, 0);
        while(i < windowSize && i < s2.length()){
            int ind = s2.charAt(i) - 'a';
            count2[ind]++;
            i++;
        }
        if(checkEqual(count,count2))
            return true;

        //process further here we are setting the value before of the index before the first index of window to zero and we are incrementing the value of the new indices of the window

        while(i < s2.length()){
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
            char oldChar = s2.charAt(i-windowSize);
            index = oldChar - 'a';
            count2[index]--;
            i++;
            if(checkEqual(count,count2))
                return true;
        }
        return false;
    }
}
