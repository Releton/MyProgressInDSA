package rick.StringsLearn;

public class ReverseWordsInAString {
    public static void main(String[] args) {
//        char[] arr = {'t', 'h', 'e', ' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        char[] arr = {'h','e','y',' ','h','o','w',' ','a','r','e',' ','y','o','u'};
        int s = 0, e = arr.length-1;
        while (s < e){
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
        int spaceIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1 || arr[i+1] == ' '){
                int k = spaceIndex;
                int j = i;
                spaceIndex = i+2;
                while (k < j){
                    char temp = arr[k];
                    arr[k++] = arr[j];
                    arr[j--] = temp;
                }
            }
        }


        System.out.println(arr);
    }
}
