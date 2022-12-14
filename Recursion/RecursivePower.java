package rick.Recursion;

import rick.utilities.UFeatures;

import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {

        int b = UFeatures.inInt("Enter the base");
        int p = UFeatures.inInt("Enter the power");
        //not optimized
        System.out.println("The answer is "+power(b,p));

        //optimized
        b = UFeatures.inInt("Enter the base");
        p = UFeatures.inInt("Enter the power");
        System.out.println("The power is "+opPower(b,p));
    }
    public static long power(int b, int p){
        if(p == 0)return 1;
        return b * power(b, p-1);
    }
    public static int opPower(int b, int p){
        if(p == 0)return 1;
        if(p == 1)return b;
        int ans = opPower(b, p/2);
        return ((p&1)==0)?ans*ans:b*(ans*ans);
    }
}
