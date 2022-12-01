package rick.Arrays2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchIn2d {
    public static void main(String[] args) {
        int[][] arr = {{2,4,6,8,10}, {3, 6, 9, 12, 15}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int n = sc.nextInt();
        System.out.println(search2d(arr,n));
    }
    public static boolean search2d(int[][] arr, int n){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == n){
                    return true;
                }
            }
        }
        return false;
    }
}
