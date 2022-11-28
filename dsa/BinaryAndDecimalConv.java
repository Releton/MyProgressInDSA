package rick.dsa;
import java.util.Scanner;
import java.lang.Math;
public class BinaryAndDecimalConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of conversion would you like? [binary to decimal(b)/ decimal to binary(d)]");
        String mode = sc.next();
        switch (mode){
            case "b" ->{
                System.out.println("Enter the binary number");
                int b = sc.nextInt();
                int ans = 0;
                int i = 0;
                while(b!=0){
                    int bit = b % 10;
                    if(bit==1){
                        ans = (int) (ans+(Math.pow(2,i)));
                    }
                    b /= 10;
                    i++;
                }
                System.out.println("Your decimal number is "+ans);
            }
            case "d" ->{
                System.out.println("Enter the decimal number");
                int d = sc.nextInt();
                int ans = 0;
                int i = 0;
                while(d!=0){
                    int bit = d & 1;
//                    ans = (ans*10)+bit;
//                          or
                    ans = (int) (bit*Math.pow(10,i))+ans;
                    d = d>>1;
                    i++;
                }
                System.out.println("You decimal number is "+ans);
            }
        }
    }
}
