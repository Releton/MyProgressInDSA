package rick.Recursion;

import rick.utilities.UFeatures;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {37,1,65,4,2,75};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int partition(int[] arr, int s, int e){
        int pivot  = arr[s];

        int count = 0;
        for(int i = s+1; i  <= e; i++){
            if(pivot >= arr[i]){
                count++;
            }
        }

        UFeatures.swap(arr, count+s, s);

        int i = s, j = e;
        while (i < count+1 && j > count+1){
            while(arr[i] <= pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if(i < count+s && j > count+s){
                UFeatures.swap(arr, i++, j--);
            }
        }
        return count+s;
    }
    public static void quickSort(int[] arr, int s, int e){
        if(s >= e)return;

        int p = partition(arr ,s ,e);

        quickSort(arr, s, p-1);
        quickSort(arr, p+1, e);
    }
}
