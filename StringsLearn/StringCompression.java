package rick.StringsLearn;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        String s = "abbccc";
        char[] arr = s.toCharArray();
        System.out.println(compress(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int compress(char[] chars){
        int n = chars.length;
        int i = 0;
        int ansInd = 0;
        while (i < n-1){
            int j = i +1;
            while (j < n && chars[i]==chars[j]){
                j++;
            }
            int count = j - i;
            chars[ansInd++] = chars[i];

            if(count > 1){
                String cnt = Integer.toString(count);
                for(int x = 0; x < cnt.length(); x++){
                    chars[ansInd++] = cnt.charAt(x);
                }
            }
            i = j;
        }
        return ansInd;

    }
}
