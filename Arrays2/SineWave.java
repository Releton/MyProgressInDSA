package rick.Arrays2;

import java.util.* ;
import java.io.*;
public class SineWave {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        System.out.println(Arrays.toString(wavePrint(arr, 2, 2)));
    }
    public static int[] wavePrint(int arr[][], int nRows, int mCols) {
//         ArrayList<Integer> ans = new ArrayList<>();
        int count = nRows * mCols;
        System.out.println(count);
        int[] ans = new int[count];
        System.out.println(ans.length);
        int k = 0;
        for(int col = 0; col < mCols; col++){
            if((col+1)%2==0){
                for(int row = nRows - 1; row >= 0;row--){
//                     ans.add(arr[row][col]);
                    ans[k++] = arr[row][col];
                }
            }
            else{
                for(int row = 0; row < nRows; row++){
//                     ans.add(arr[row][col]);
                    ans[k++] = arr[row][col];
                }
            }
        }
        return ans;
//         return ans.toArray();
    }
}


