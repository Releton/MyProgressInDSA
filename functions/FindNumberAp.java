package rick.functions;

import java.util.Scanner;

public class FindNumberAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();
        System.out.println("Set bit is "+getSetBits(n,b));
        System.out.println(getAnswer(n));
    }
    public static int getAnswer(int n){
        return 3 * n + 7;
    }
    public static int getSetBits(int n, int b){
        int count = 0;
        while (n!=0){
            if((n&1)==1){
                count += 1;
            }
            n = n>> 1;
        }
        while (b != 0){
            if((b&1)==1){
                count += 1;
            }
            b = b >> 1;
        }

        return count;
    }
}
