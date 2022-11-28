package rick.functions;

import java.util.Scanner;

public class PrimeNumberFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
