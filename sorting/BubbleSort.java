package rick.sorting;

import rick.utilities.UFeatures;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {7,5,6,2,1,3};
        int n = arr.length;
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int[] arr, int n){
        for(int i = 0; i < n; i++){
            boolean isSorted = true;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    isSorted = false;
                }
            }
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
