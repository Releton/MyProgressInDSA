package rick.StringsLearn;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        System.out.println(containsPermutation(s1,s2));
    }
    private static boolean checkEqual(int[] count1, int[] count2){
        //checking if values of the count of characters in main string is equal to the substring
        for(int i = 0; i < 26; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean containsPermutation(String s1, String s2){
        int[] count = new int[26];//Store the count of characters in substring
        Arrays.fill(count,0);
        for (int i = 0; i < s1.length(); i++) {//store count
            int ind = s1.charAt(i) - 'a';
            count[ind]++;
        }
        //now traverse main string in window of size s1 length and compare
        int i = 0;
        int windowSize = s1.length();
        int[] count2 = new int[26];//store the count of character in main string in the given window
        Arrays.fill(count2, 0);
        while(i < windowSize && i < s2.length()){//check if the i is smaller than the windowSize and i is smaller that the length of main string
            int ind = s2.charAt(i) - 'a';
            count2[ind]++;//increase the character count of the main string present in the window mask
            i++;
        }
        if(checkEqual(count,count2))//check if we already got the answer
            return true;

        //process further here we are setting the value before of the index before the first index of window to zero and we are incrementing the value of the new indices of the window

        while(i < s2.length()){
            char ch = s2.charAt(i);//store the character at i index remember is no more zero. In the first loop it had covered the size of a window
            int index = ch - 'a';//get the index of the character
            count2[index]++;//increment the count
            char oldChar = s2.charAt(i-windowSize);//old character is i - windowSize so now decrease it
            index = oldChar - 'a';
            count2[index]--;
            i++;//increase i
            if(checkEqual(count,count2))//if condition satisfied return true;
                return true;
        }
        //if till not satisfied return false;
        return false;
    }
}
