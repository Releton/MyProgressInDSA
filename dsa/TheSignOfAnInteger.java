package rick.dsa;

import java.util.Scanner;

public class TheSignOfAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = sc.nextInt();
        boolean ans = false;

        for(int i = 0; i <= 32; i++){
            if(i!=32){
                n = n >> 1;
                continue;
            }
            if((n&1)==0){
                ans = false;
                break;
            }
            ans = true;
        }
        if(ans){
            System.out.println("Negative");
        }
        else {
            System.out.println("Positive");
        }
    }
}
