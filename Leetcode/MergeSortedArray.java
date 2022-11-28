package rick.Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,7,8,9};
        int[] arr2 = {2,4,5,6};
        int[] arr3;
        arr3 = new int[9];
        merge(arr,arr2,arr3);
        System.out.println(Arrays.toString(arr3));
    }
    public static void merge(int[] arr1, int[] arr2, int[] ans){
        int size1 = arr1.length;
        int size2 = arr2.length;
        int size3 = ans.length;
        int k = 0;
        int i = 0;
        int j = 0;
        for(; i < size1 && j < size2; ){
            if(arr2[j] < arr1[i]){
                ans[k++] = arr2[j++];
            }
            else{
                ans[k++] = arr1[i++];
            }
        }
        for (; i < size1; i++, k++){
            ans[k] = arr1[i];
        }
        for (; j < size2; j++, k++){
            ans[k] = arr1[j];
        }
    }

}
