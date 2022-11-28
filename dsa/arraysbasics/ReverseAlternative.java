package rick.dsa.arraysbasics;

public class ReverseAlternative {
    public static void main(String[] args) {
        int [] even = {1,2,3,4,5,6};
        int [] odd = {1,2,3,4,5,6,7};
        ReverseArray.printArray(even);
        ReverseArray.printArray(odd);
        System.out.println("After reversing in pairs");
        reverseAlternate(even);
        reverseAlternate(odd);
        ReverseArray.printArray(even);
        ReverseArray.printArray(odd);
    }
    public static void reverseAlternate(int[] arr){
        for(int i = 0; i < arr.length; i+=2){
            if(i+1<arr.length-1){
                swap(arr,i,i+1);
            }
        }
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
