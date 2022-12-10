package rick.Maths;

import java.util.Scanner;

public class ecluidsGCD {
    public static void main(String[] args) {
        System.out.println("Enter the number a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println("The lcm is "+((a*b)/gcd(a,b)));
    }
    public static int gcd(int a, int b){
        if(a == 0)return b;
        if(b==0)return a;
        while(a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }
}
