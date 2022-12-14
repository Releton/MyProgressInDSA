package rick.Recursion;

import rick.utilities.UFeatures;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted");
        insertSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr, int n){
        if(n <= 1){
            return;
        }
        insertSort(arr, n-1);
        int j= n-2;
        int last = arr[n-1];
        while(j >= 0 && last <= arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
