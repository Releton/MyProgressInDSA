package rick.Arrays2;

public class RowSum2d {
    public static void main(String[] args) {
        int[][] arr = {{1,7,9,2},{21,10,12,9}};
        getSum(arr);
    }
    public static void getSum(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
