package rick.Arrays2;

import java.util.ArrayList;
import java.util.* ;
import java.io.*;
public class TripletsWithSum {

    public static void main(String[] args) {
        int[] arr = {10 ,5, 5, 5, 2};

        System.out.println(findTriplets(arr, arr.length, 12));
    }


        public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            int i = 0;
            while(i < n-2){
                ArrayList<Integer> sRes = new ArrayList<>();
                int k = i + 2;
                int sum = 0;
                while(k >= i){
                    if(sum > K)break;
                    sum += arr[k];
                    sRes.add(arr[k]);
                    k--;
                }

                if(sum == K){
                    res.add(sRes);
                }
                i++;
            }
            return res;

        }


}
