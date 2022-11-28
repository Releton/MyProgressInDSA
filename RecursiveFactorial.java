package rick;

import java.util.Scanner;

public class RecursiveFactorial {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        if(n < 2){
            return n;
        }
        return n * factorial(n-1);
    }
    public static int getInput(String prompt){
        System.out.println(prompt);
        return new Scanner(System.in).nextInt();
    }
    public static void main(String[] args) {
        System.out.println(factorial(getInput("Enter the number to get the factorial: ")));
    }
}
