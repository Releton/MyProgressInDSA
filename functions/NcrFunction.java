package rick.functions;

import java.util.Scanner;

public class NcrFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        System.out.println("The ncr of "+n+" and "+r+" is "+ncr(n,r));
    }
    public static int ncr(int n, int r){
        return ((getFactorial(n))/(getFactorial(r)*getFactorial(n-r)));
    }
    public static int getFactorial(int n){
        int ans = n;
        for(int i = 1; i< n; i++){
            ans = ans*i;
        }
        return ans;
    }
}
