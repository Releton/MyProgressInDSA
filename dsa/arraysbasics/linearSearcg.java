package rick.dsa.arraysbasics;

import java.util.Scanner;

public class linearSearcg {
    public static void main(String[] args) {

        int[] arr = {5, 7, -2, 10, 15, 19, 31};

        System.out.println("Enter the key");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean found = search(arr,arr.length,key);
        if(found){
            System.out.println("Present ");
        }
        else {
            System.out.println("Absent");
        }

    }
    public static boolean search(int[] arr , int size, int key){
        for(int i = 0; i < size; i++){

            if(arr[i]==key){
                return true;
            }

        }
        return false;
    }
}
