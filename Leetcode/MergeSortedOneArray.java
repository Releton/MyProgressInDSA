package rick.Leetcode;
//https://leetcode.com/problems/merge-sorted-array/
//Leetcode 88
public class MergeSortedOneArray {
    public static void main(String[] args) {

    }
    public static void merge(int[] arr, int m, int[] arr2, int n){
        for(int i = m + n - 1, a = m-1, b = n -1; b >= 0; i--){
            if(a >=0 && arr[a] > arr2[b]) arr[i] = arr[a--];
            else arr[i] = arr2[b--];
        }
    }
}
