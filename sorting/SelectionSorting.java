package rick.sorting;
import rick.utilities.UFeatures;
public class SelectionSorting {
    public static void main(String[] args){
        int[] arr = {7, 5 ,6 ,2, 1 , 3};
        int n = arr.length;
        System.out.println("Before\n\n");
        UFeatures.printArray(arr);
        System.out.println("After\n\n");

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[j]<arr[i]){
                    UFeatures.swap(arr,i,j);
                }
            }
        }

        UFeatures.printArray(arr);
    }
}
