package rick.Maths;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println("Enter the range");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberofPrimes(n));
        sc.close();
    }
    public static  int numberofPrimes(int n){
        Boolean[] primes = new Boolean[n];
        int cnt = 0;
        Arrays.fill(primes, true);
        if(n==0||n==1)return 0;
        primes[0] = primes[1] = false;
        for(int i = 2; i < n; i++){
            if(primes[i]){
                cnt++;
                for(int j = 2 * i; j < n; j = j + i){
                    primes[j] = false;
                }
            }
        }
        return cnt;
    }
}

