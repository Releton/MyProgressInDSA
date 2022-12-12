package rick.Recursion;

import rick.utilities.UFeatures;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,9,3,2,7};
        System.out.println("The element is at index "+linearSearch(arr,0, UFeatures.inInt("Enter the number to check")));
    }
    public static int linearSearch(int[] arr, int i, int k){
        if(arr.length == i || arr.length == 0)return -1;
        return (arr[i]==k)?i:linearSearch(arr,i+1,k);
    }
}
