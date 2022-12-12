package rick.Recursion;

import rick.utilities.UFeatures;

public class ReverseCount {
    public static void main(String[] args) {
        count(UFeatures.inInt("Enter the number"));
    }
    public static void count(int n){
        if(n==0) return;
        System.out.println(n);
        count(n-1);
    }
}
