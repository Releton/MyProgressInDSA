package rick.Arrays2;

import java.util.ArrayList;
import java.util.List;

class SpiralPrinting {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiralOrder(arr);
        System.out.println(result);
    }
    public static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> arr = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;
        int total = n * m;
        int startRow = 0, startCol = 0, endingRow = n - 1, endingCol = m - 1;

        while(count < total){
            //print the first row
            for(int index = startCol; index <= endingCol && count < total; index++){
                arr.add(mat[startRow][index]);
                count++;
            }
            startRow++;
            //print the last column
            for (int index = startRow; index <= endingRow&& count < total; index++) {
                arr.add(mat[index][endingCol]);
                count++;
            }
            endingCol--;
            //print the last row or ending row
            for (int index = endingCol; index >= startCol && count < total; index--) {
                arr.add(mat[endingRow][index]);
                count++;
            }
            endingRow--;
            //printing the first column
            for (int index = endingRow; index >= startRow&& count < total; index--) {
                arr.add(mat[index][startCol]);
                count++;
            }
            startCol++;

        }


        return arr;
    }
}