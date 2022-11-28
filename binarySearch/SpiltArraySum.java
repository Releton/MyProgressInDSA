package rick.binarySearch;

class SpiltArraySum {

    public static void main(String[] args) {
        int[] arr = {4,2,5,3,1};
        int k = 2;
        System.out.println(splitArray(arr,k));
    }

    static public int splitArray(int[] arr, int k) {
        int s = 0;
        int sum = 0;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int e = sum;

        while(s <= e){
            int mid = (s+e)/2;
            if(isPossible(mid,arr,k)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
    static public boolean isPossible(int mid, int[] arr, int k){
        int division = 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] + sum <= mid){
                sum += arr[i];
            }
            else{
                division++;
                if(division > k || arr[i] > mid){
                    return false;
                }
                sum = 0;
                sum += arr[i];
            }
        }
        return true;
    }
}