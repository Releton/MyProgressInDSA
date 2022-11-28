package rick.StringsLearn;

import java.util.Arrays;

public class PermutationRewriteForPractice {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaoo";
        System.out.println(containsPermutation(s1,s2));
    }
    public static boolean containsPermutation(String s1, String s2){
        int[] count1 = new int[26];
        Arrays.fill(count1,0);
        for(int i = 0; i < s1.length(); i++){
            int ind = s1.charAt(i) - 'a';
            count1[ind]++;
        }
        int[] count2 = new int[26];
        Arrays.fill(count2, 0);
        int i = 0, windowSize = s1.length();
        while (i < windowSize && i < s2.length()){
            int index = s2.charAt(i) - 'a';
            count2[index]++;
            i++;

        }
        if(containEqual(count1, count2)){
            return true;
        }


        while (i < s2.length()){
            int index = s2.charAt(i) - 'a';
            count2[index]++;
            index = s2.charAt(i-windowSize) - 'a';
            count2[index]--;
            i++;
            if(containEqual(count1,count2)){
                return true;
            }
        }
        return false;
    }
    public static boolean containEqual(int[] count1, int[] count2){
        for(int i = 0; i < 26; i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }
}
