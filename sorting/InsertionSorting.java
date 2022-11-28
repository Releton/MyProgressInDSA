package rick.sorting;
import java.util.Arrays;
import java.util.Collections;
public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,7,8,9};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
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
