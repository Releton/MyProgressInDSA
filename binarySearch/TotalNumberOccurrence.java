package rick.binarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class TotalNumberOccurrence {

    public static int firstOccurrence(ArrayList<Integer> arr, int length, int key){

        int s = 0, e  = length - 1, ans = -1;
        int mid = s + (e-s)/2;
        while (s <= e){
            if(arr.get(mid)==key){
                ans = mid;
                e = mid - 1;
            }
            else if(key > arr.get(mid)){
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
    public static int lastOccurrence(ArrayList<Integer> arr, int length, int key){

        int s = 0, e  = length - 1, ans = -1;
        int mid = s + (e-s)/2;
        while (s <= e){
            if(arr.get(mid)==key){
                ans = mid;
                s = mid + 1;
            }
            else if(key > arr.get(mid)){
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>( );
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        Collections.sort(arrayList);
        System.out.println("The number of occurance of 3 is "+(lastOccurrence(arrayList,arrayList.size(),3)-firstOccurrence(arrayList,arrayList.size(),3)+1));
    }
}
