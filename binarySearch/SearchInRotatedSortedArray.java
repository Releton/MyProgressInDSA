package rick.binarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(getPivot(arr));
        int key = 3;
        System.out.println(getResult(arr,key));

    }
    public static int getResult(int[] arr, int k){
        int n = arr.length;
        int pivot = getPivot(arr);
        //If pivot is not found that means the array is not rotated
        if(pivot==-1){
            return binarySearch(arr,k,0, arr.length-1);
        }
        if(k == arr[pivot]){
            return pivot;
        }
        else if(k < arr[0]){
            return binarySearch(arr,k,pivot +1, arr.length-1);
        }
        else if(k >= arr[0]){
            return binarySearch(arr,k,0,pivot-1);
        }
        return -1;
    }
    public static int getPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        int mid = (s+e)/2;
        while (s <= e){
            if(arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            else if(s > arr[mid]){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
            mid = (s+e)/2;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target, int s,int e){
        int mid = (s+e)/2;
        while(s <= e){
            if(arr[mid]==target){
                return mid;
            }
            else if(target < arr[mid]){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
            mid = (s+e)/2;
        }
        return -1;
    }
}
