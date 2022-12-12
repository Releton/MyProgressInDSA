package rick.Recursion;

import rick.utilities.UFeatures;

public class SpeakOutLoud {
    static String[] map = {"One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};

    public static void main(String[] args) {
        shoutOut(UFeatures.inInt("Enter the number to speak"));
    }
    public static void shoutOut(int n){
        if(n == 0)return;
        shoutOut(n/10);
        if(n%10!=0)
            System.out.print(map[n%10-1]);
        else{
            System.out.print("Zero ");
        }
    }
}
