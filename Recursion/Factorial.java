package rick.Recursion;

import rick.utilities.UFeatures;

public class Factorial {
    public static void main(String[] args) {
        int n;
        System.out.println(getFactorial(UFeatures.inInt("Enter the number to get the factorial of")));
    }
    public static int getFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n * getFactorial(n-1);
    }
}
