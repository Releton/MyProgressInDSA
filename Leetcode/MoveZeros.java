package rick.Leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeros {
    public static void main(String[] args) {
        //leetcode 283.
        int[] arr = {0,1,0,3,12};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void moveZeros(int[] arr){
        int n = arr.length;
        int i = 0, j = 0;
        while(j < n){
            if(arr[j]!=0){
                swap(arr,j,i);
                i++;
            }
            j++;
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
