package rick.Maths;

import java.util.ArrayList;
import java.util.Scanner;

public class SegmentedSeive {
    public static boolean[] createSeive(){
        int N = 1000000;
        boolean[] seive = new boolean[N+1];
        for(int i = 2; i <= N; i++){
            seive[i] = true;
        }
        for(int  i =2; i * i <= N; i++){
            if(seive[i]){
                for(int  j = i * i; j <= N; j++){
                    seive[j] = false;
                }
            }
        }
        return seive;
    }
    public static ArrayList<Integer> generatePrimes(int n){
        ArrayList<Integer> ds = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if()
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int l,r;
        l = sc.nextInt();
        r = sc.nextInt();
        boolean[] seive = createSeive();

    }

}
