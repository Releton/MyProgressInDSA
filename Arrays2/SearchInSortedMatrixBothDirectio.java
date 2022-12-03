package rick.Arrays2;

public class SearchInSortedMatrixBothDirectio {
    public static void main(String[] args) {

    }
    public static boolean search(int[][] arr, int target){
        int row = 0, col = arr[0].length-1;
        int mid = arr[row][col];
        while(row < arr.length && col >= 0){
            if(mid == target){
                return true;
            }
            else if(mid < target){
                row++;
            }
            else{
                col--;
            }
            mid = arr[row][col];
        }
        return false;
    }
}
