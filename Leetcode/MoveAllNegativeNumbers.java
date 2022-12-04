package rick.Leetcode;
import rick.utilities.UFeatures;

import java.util.Arrays;

public class MoveAllNegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void move(int[] arr){
        int s = 0, k = 0;
        while(s < arr.length){
            if(arr[s]<0){
                UFeatures.swap(arr, k, s);
                k++;
            }
            s++;
        }
    }
}
