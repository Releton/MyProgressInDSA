package rick.dsa.arraysbasics;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printArray(arr);
        System.out.println("After reversing");
        reverse(arr);
        printArray(arr);
        System.out.println("After reversing the reversed");
        reverse2(arr);
        printArray(arr);
    }
    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
    public static void reverse2(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
}
