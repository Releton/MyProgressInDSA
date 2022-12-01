package rick.StringsLearn;

public class StringCompression {
    public static void main(String[] args) {

    }
    public static int compress(char[] chars){
        int n = chars.length;
        int i = 0;
        int ansInd = 0;
        while (i < n){
            int j = i +1;
            while (chars[i]==chars[j]){
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
