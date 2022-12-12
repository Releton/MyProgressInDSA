package rick.Recursion;

import rick.utilities.UFeatures;

public class powers {
    public static void main(String[] args) {
        System.out.println(pow(UFeatures.inInt("Enter the base"), UFeatures.inInt("Enter the power")));
    }
    public static int pow(int b, int p){
        if(p == 0)return 1;
        return b * pow(b,p-1);
    }
}
