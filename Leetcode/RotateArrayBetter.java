package rick.Leetcode;

import java.util.Arrays;

public class RotateArrayBetter {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        rotate(arr,arr.length,4);
        System.out.println(Arrays.toString(arr));
    }
    public static void  rotate(int arr[], int n, int rotation)
    {
        reverse(arr, 0, n - rotation-1 % n);
        reverse(arr, 0, n-1);
    }
    public static void  swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void  reverse(int[] arr, int s, int e){
        while(s < e){
            swap(arr, s++, e--);
        }
    }
}
