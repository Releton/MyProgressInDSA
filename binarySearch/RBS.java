package rick.binarySearch;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,4,5,6,6,1,2,3,3};
        int pivot = getPivotWithDuplicate(arr);
        System.out.println(pivot);
    }
    public static int getPivot(int[] arr){
        int s = 0, e = arr.length-1, mid = (s+e)/2;
        while(s <=e ){
            if(mid < e && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > s && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid] < arr[s]){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }

        return -1;
    }
    public static int getPivotWithDuplicate(int[] arr){
        int s = 0, e = arr.length-1, mid = (s+e)/2;
        while(s <=e ){
            if(mid < e && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > s && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid] == arr[s] && arr[s] == arr[e]){
                if(arr[s] > arr[s+1]){
                    return s;
                }
                s++;
                if(arr[e] < arr[e-1]){
                    return e -1;
                }
                e--;
            }
            else if(arr[s] < arr[mid] || (arr[mid] == arr[s] && arr[mid] < arr[e])){
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }

        return -1;
    }
}
