package rick.Arrays2;

import java.util.Scanner;

public class IntroTo2d
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Enter the element at row "+i+" and column "+j+": ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ", ");
            }
        }
        //column wise input in 2d arrays
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.println("Enter the number in row "+(j+1)+ "column "+(i+1));
                arr[j][i] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
