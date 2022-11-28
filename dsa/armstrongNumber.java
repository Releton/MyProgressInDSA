package rick.dsa;
import java.lang.Math;
import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check if it is armstrong");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        int temp2 = temp;
        int sum = 0;
        while(n!=0){
            count += 1;
            n /= 10;
        }
        while(temp!=0){
            sum += Math.pow(temp%10,count);
            temp /= 10;
        }
        if(temp2==sum){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an armstrong number");
        }

    }
}
