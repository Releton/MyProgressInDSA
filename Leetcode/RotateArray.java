package rick.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {2,11,4,9};

        System.out.println(Arrays.toString(rotateArray(arr,1)));
    }
    public static int[] rotateArray(int[] arr, int k){
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[(k+i)%arr.length] = arr[i];
        }
        return temp;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
