package rick.dsa.arraysbasics;

import java.util.Scanner;

public class ArrayBasics1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = inputArray(size);
        System.out.println("The maximum number in this array is "+getMaxAndMin(arr)[1]+" The minimum is "+getMaxAndMin(arr)[0]+" and their sum is "+sumOfArray(arr));

    }
    public static int[] inputArray(int size){
        int [] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the value at index "+i);
            arr[i]  = sc.nextInt();
        }
        return arr;
    }
    public static int sumOfArray(int[] arr){
        int sum = 0;
        for(int i = 0; i <= arr.length-1; i++){
            sum += arr[i];
        }
        return sum;
    }
    static public int[] getMaxAndMin(int[] arr){
        int max = 0;
        int min = arr[0];
        for(int i = 0; i < arr.length ;i ++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return new int[]{min,max};
    }
}
