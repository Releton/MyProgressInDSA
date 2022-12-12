package rick.Recursion;

import rick.utilities.UFeatures;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(UFeatures.inInt("Enter the number")));
    }
    public static int fib(int n){
        if(n < 2)return n;
        return fib(n-1)+fib(n-2);
    }
}
