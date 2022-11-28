package rick.binarySearch;

public class FirstAndLastOccuranceBST {

    public static int firstOccurance(int[] arr, int length, int key){

        int start = 0;
        int end = length - 1;
        int mid = (start+end)/2;
        int ans = 0;
        while (start<= end){
            if(arr[mid]==key){
                ans = mid;
                end = mid - 1;
            }
            else if(key>arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            mid = (start+end)/2;
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int length, int key){
        int s = 0, e = length - 1;
        int mid = (s+e)/2, ans = 0;
        while (s <= e){
            if(arr[mid]==key){
                ans = mid;
                s = mid + 1;
            }
            else if(key>arr[mid]){//go right
                s = mid + 1;
            }
            else{//go left
                e = mid - 1;
            }
            mid = (e+s)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] even = {1,2,3,3,5};
        System.out.println("The first occurance of 3 is "+firstOccurance(even,even.length,3)+" and the last occurance of 3 is "+lastOccurrence(even,even.length,3));

    }
}
