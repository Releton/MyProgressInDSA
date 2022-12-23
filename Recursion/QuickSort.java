/*
package rick.Recursion;

import rick.utilities.UFeatures;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {37,1,65,4,2,75};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int partition(int[] arr, int s, int e){
        int pivot  = arr[s];

        int count = 0;
        for(int i = s+1; i  <= e; i++){
            if(pivot >= arr[i]){
                count++;
            }
        }

        UFeatures.swap(arr, count+s, s);

        int i = s, j = e;
        while (i < count+1 && j > count+1){
            while(arr[i] <= pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if(i < count+s && j > count+s){
                UFeatures.swap(arr, i++, j--);
            }
        }
        return count+s;
    }
    public static void quickSort(int[] arr, int s, int e){
        if(s >= e)return;

        int p = partition(arr ,s ,e);

        quickSort(arr, s, p-1);
        quickSort(arr, p+1, e);
    }
}
*/
package rick.Recursion;

import java.util.* ;

public class QuickSort {
    static void random(List<Integer> arr,int low,int high)
    {

        Random rand= new Random();
        int pivot = rand.nextInt(high-low)+low;

        int temp1=arr.get(pivot);
        arr.set(pivot, arr.get(low));
        arr.set(low, temp1);
    }
    public static int partition(List<Integer> arr, int s, int e){
        random(arr,s,e);
        int pivot = arr.get(s);
        int cnt = 0;
        for(int i = s+1; i<=e;i++){
            if(pivot >= arr.get(i)){
                cnt++;
            }
        }
        int pind = cnt+s;
        swap(arr, pind, s);

        int i= s, j = e;
        while(i < pind && j > pind){
            while(arr.get(i) <= pivot){
                i++;
            }
            while(arr.get(j) > pivot){
                j--;
            }
            if(i < pind && j > pind){
                swap(arr, i++, j--);
            }
        }
        return pind;
    }
    public static void swap(List<Integer> arr, int a, int b){
        int temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }

    public static void quickSolve(List<Integer> arr, int s, int e){
        if(s >= e)return;
        int p = partition(arr, s, e);
        quickSolve(arr, s, p-1);
        quickSolve(arr, p+1, e);
    }

    public static List<Integer> quickSort(List<Integer> arr){
        quickSolve(arr, 0, arr.size()-1);
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>(
            Arrays.asList(9 ,9 ,9, 8 ,2, 3 ,-6 )
        );
        System.out.println(quickSort(arr));
    }
}