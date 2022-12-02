package rick.StringsLearn;

import java.util.Arrays;

public class CloseStrings {

    public static void main(String[] args) {
        String word1 = "abbzccca";
        String word2 = "babzzczc";
        System.out.println(closeStrings(word1,word2));
    }
    public static boolean closeStrings(String word1, String word2) {
        int[] count1 = new int[26];
        Arrays.fill(count1, 0);
        int[] count2 = new int[26];
        Arrays.fill(count2, 0);
        int counted1 = 0, counted2 = 0;
        for(int i = 0; i < word1.length(); i++){
            int index = word1.charAt(i) - 'a';
            count1[index]++;
        }
        for(int i = 0; i < word2.length(); i++){
            int index = word2.charAt(i) - 'a';
            count2[index]++;
        }
        System.out.println(Arrays.toString(count1));
        System.out.println(Arrays.toString(count2));




        for(int i = 0; i < 26; i++){
            if(count1[i]!=0){
                counted1++;
            }
            if(count2[i]!=0){
                counted2++;
            }
        }
        System.out.println(counted1);
        System.out.println(counted2);
        int toGo = 0;
        for(int i = 25; i >= 0; i--){
            if(count1[i] != 0 || count2[i]!=0){
                toGo = i;
                break;
            }
        }
        System.out.println(toGo);
        boolean isTrue = false;
        for(int i = 0, k = 0; i <= toGo; i++){
            if(word1.length()!= word2.length() || ((count1[i] == 0 || count2[i]==0) && (k > counted1))){
                return false;
            }
            if(count1[i] != 0)
                k++;
        }
        return true;


    }
}
