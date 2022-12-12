package rick.Recursion;

public class FIndSortedRec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = {1,3,2,4};
        System.out.println("Array 1 is sorted = " +isSorted(arr, 0));
        System.out.println("Array 2 is sorted = "+isSorted(arr2,0));
    }
    public static boolean isSorted(int[] arr, int s){
        if((arr.length-1) == s)return true;

        if(arr[s] < arr[s+1]){
            return isSorted(arr, s+1);
        }
        return false;
    }
}
