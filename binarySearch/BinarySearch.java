package rick.binarySearch;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int length, int key){

        int start = 0;
        int end = length-1;
        int mid = start + (end-start)/2;
        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] even = {2,4,6,8,8,12,15};
        int[] odd = {3,8,11,11,16};

        System.out.println("Enter the key for even");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("The answer is " + binarySearch(even,even.length,index));
        System.out.println("Enter the key for odd");
        int oddKey = sc.nextInt();
        System.out.println("The answer is "+binarySearch(odd,odd.length,oddKey));
    }
}
