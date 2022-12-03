package rick.sorting;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort012(int[] arr){
        int s = 0, e = arr.length-1, m = 0;
        while(m<=e){
            switch (arr[m]){
                case 0:{
                    swap(arr, m,s );
                    s++;
                    m++;
                    break;
                }
                case 1:
                    m++;
                    break;
                case 2:
                    swap(arr, m, e);
                    e--;
                    break;
            }
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
