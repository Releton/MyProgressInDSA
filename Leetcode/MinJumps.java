package rick.Leetcode;

import rick.utilities.UFeatures;

public class MinJumps {
    public static void main(String[] args) {
//        int[] arr = {83 61 83 12 27 100 34 0 35 10 10 96 39 87 53 5 40 42 66 15 90 71 55 87 39 5 88 49 97 100 32 4 60 81 83 53 80 16 53 14 94 29 77 99 16 29 3 22 71 35 4 61 6 25 13 11 30 0 27 94 66 25 64 92 5 47 44 85 29 63 65 89 59 41 87 41 36 57 29 7 92 33 34 64};

//        int[] arr = {61,83,12,27,100,34,0,35,10,10,96,39,87,53,5,40,42,66,15,90,71,55,87,39,5,88,49,97,100,32,4,60,81,83,53,80,16,53,14,94,29,77,99,16,29,3,22,71,35,4,61,6,25,13,11,30,0,27,94,66,25,64,92,5,47,44,85,29,63,65,89,59,41,87,41,36,57,29,7,92,33,34,64};
        int[] arr = {2 ,3, 1, 1, 2, 4, 2, 0, 1, 1};
        System.out.println(minJumps(arr));
    }
    static int minJumps(int[] arr){

        if(arr[0]==0)return -1;


        int res = - 1;
        int firstZeroIndex = 10000000;
        int jumps = 0;

        for(int i = 1, x = 0; i < arr.length;i++){
            if(i==arr.length-1)return i;
            x += arr[x];

            jumps++;

            if(x >= arr.length-1 || arr[x]==0 || arr[x+1]==0){
                return jumps;
            }
        }
        return -1;
    }
}
