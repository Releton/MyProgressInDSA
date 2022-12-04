package rick.utilities;
import java.util.Scanner;
public class UFeatures {
    static Scanner sc = new Scanner(System.in);
    public static int inInt(String prompt){
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("\b\b");
    }
    public static void printString(String s){
        s = s.replace(' ',',');
        System.out.println(s);
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
