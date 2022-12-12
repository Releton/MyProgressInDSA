package rick.Recursion;

import rick.utilities.UFeatures;

public class Count {
    public static void main(String[] args) {
        count(UFeatures.inInt("Enter a number to count"));
    }
    public static void count(int n){
        if(n==0)return ;
        count(n-1);
        System.out.println(n);
    }
}
