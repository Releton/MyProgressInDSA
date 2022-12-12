package rick.Recursion;

import rick.utilities.UFeatures;

public class BinarySearchWithRec {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,13};
        System.out.println(biarySearch(arr,0,arr.length-1, UFeatures.inInt("Enter the target")));
    }
    public static int biarySearch(int[] arr, int s, int e, int target){
        if(s > e)return -1;
        int mid  = s + (e-s)/2;
        if(arr[mid]==target)return mid;
        else if(arr[mid] < target){
            return biarySearch(arr, mid+1, e, target);
        }
        else{
            return biarySearch(arr, s, mid -1, target);
        }
    }
}
