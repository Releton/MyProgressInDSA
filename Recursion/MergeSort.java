package rick.Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,82,9,7,10};
        mergeArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int[] arr, int s, int e){
        int mid = (s+e)/2;
        int len1 = mid - s+1;
        int len2 = e - mid;
        int[] Sarr1 = new int[len1];
        int[] Sarr2 = new int[len2];
        int k = s;
        for(int i = 0; i < len1; i++){
            Sarr1[i] = arr[k++];
        }
        k = mid + 1;
        for(int i = 0; i < len2; i++){
            Sarr2[i] = arr[k++];
        }
        k = s;
        int i1 = 0, i2 = 0;
        while (i1 < len1 && i2 < len2){
            if(Sarr1[i1] < Sarr2[i2]){
                arr[k++] = Sarr1[i1++];
            }
            else{
                arr[k++] = Sarr2[i2++];
            }
        }
        while (i1 < len1){
            arr[k++] = Sarr1[i1++];
        }
        while (i2 < len2){
            arr[k++] = Sarr2[i2++];
        }
    }
    public static void mergeArray(int[] arr, int s, int e){
        if(s >= e)return;
        int mid = (s+e)/2;
        mergeArray(arr, s, mid);
        mergeArray(arr, mid +1, e);
        merge(arr, s, e);
    }
}
