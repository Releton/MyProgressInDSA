package rick.functions;

import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        printCounting(new Scanner(System.in).nextInt());

    }
    public static void printCounting(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
