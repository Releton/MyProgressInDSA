package rick.Recursion;

import rick.utilities.UFeatures;

import java.util.Arrays;

public class SelectionSortRec {
    public static void main(String[] args) {
        int[] arr = {7,5,3,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted");
        selecSort(arr, arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selecSort(int[] arr, int n, int i){
        if(n == 0|| n== 1 || i == n-1)return;
        int curr = arr[i];
        for(int j = i+1; j < n;j++){
            if(arr[j]<arr[i]){
                UFeatures.swap(arr, j, i);
            }
        }
        selecSort(arr, n, i +1);
    }
}
