package rick.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int n = arr.length;
        cyclic(arr,n);
        System.out.println(Arrays.toString(arr));

    }
    public static void cyclic(int[] arr, int n){
        for(int i = 0; i < n; i++){
            if(arr[i] == arr[i]-1){
                i++;
            }
            else{
                InsertionSorting.swap(arr, i, arr[i]-1);
            }
        }
    }
}
