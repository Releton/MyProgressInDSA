package rick.Recursion;

import rick.utilities.UFeatures;

import java.util.Arrays;

public class BubbleSortRec {
    public static void main(String[] args) {
        int[] arr = {7,5,3,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted");
        sortArray(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void sortArray(int[] arr, int n){
        if(n == 0|| n==1)return;
        for(int i = 0;i < n-1; i++){
            if(arr[i] > arr[i+1]){
                UFeatures.swap(arr, i, i+1);
            }
        }
        sortArray(arr, n-1);
    }
}
