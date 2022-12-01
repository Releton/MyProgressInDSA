package rick.Arrays2;

public class LargestRowSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{100,200,300},{420,100,2000}};
        System.out.println(getBiggestRow(arr));
    }
    public static int getBiggestRow(int[][] arr){
        int max = arr[0][0];
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }
            if(sum > max){
                ans = i;
                max = sum;
            }
        }
        return ans;
    }
}
