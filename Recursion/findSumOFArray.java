package rick.Recursion;

public class findSumOFArray {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,6};
        System.out.println(sum(arr,arr.length-1));
    }
    public static int sum(int[] arr, int i){
        if(i < 0)return 0;
        return arr[i] + sum(arr, i-1);
    }
}
