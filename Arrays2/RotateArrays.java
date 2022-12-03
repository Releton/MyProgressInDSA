package rick.Arrays2;

import java.util.Arrays;

public class RotateArrays {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{2,2,2},{3,3,3}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            int li = 0;
            int ri = matrix.length - 1;
            while(li < ri){
                int temp = matrix[i][li];
                matrix[i][li] = matrix[i][ri];
                matrix[i][ri] = temp;
                li++;
                ri--;
            }
        }
    }
}
