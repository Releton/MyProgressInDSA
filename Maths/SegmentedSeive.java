package rick.Maths;

import rick.utilities.UFeatures;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SegmentedSeive {
    static int N = 1000000;
    static boolean[] sieve = new boolean[N + 1];
    public static void createSieve(){
        Arrays.fill(sieve, true);
        for(int i = 2; i < N; i++){
            if(sieve[i]){
                for(int j = i * i; j <= N; j++){
                    sieve[j] = false;
                }
            }
        }
    }
    public static ArrayList<Integer> generatePrime(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(sieve[i]){
                al.add(i);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        createSieve();
        int l, r;
        l = UFeatures.inInt("Enter the low range");
        r  = UFeatures.inInt("Enter the high range");
        //step 1 generate all primes till sqrt of r
        ArrayList<Integer> primes = generatePrime((int)(Math.sqrt(r)));
        //step 2 create a dummy array of size r - l +1 and mark everybody as true
        boolean[] dummy  = new boolean[r - l +1];
        Arrays.fill(dummy, true);
        //for all primes mark its multiples as false
        for(Integer prime : primes){
            int firstMultiple = (((l/prime)*prime)<l)?((l/prime)*prime)+prime:((l/prime)*prime);
            for(int j = Math.max(firstMultiple, prime*prime); j <= r; j += prime){
                dummy[j-l] = false;
            }
        }
        //step 4 display or store all the primes
        for(int i = l; i <= r; i++){
            if(dummy[i-l]){
                System.out.println(i);
            }
        }

    }
}
