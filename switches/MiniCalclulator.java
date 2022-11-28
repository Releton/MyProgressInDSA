package rick.switches;

import java.util.Scanner;

public class MiniCalclulator {
    public static void main(String[] args){
        int a,b,c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A");
        a = sc.nextInt();
        System.out.println("Enter the value of B");
        b = sc.nextInt();

        System.out.println("Enter the operator to use");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '*':
                c = a * b;
                break;
            case '/':
                c = a / b;
                break;
            case '+':
                c = a + b;
                break;
            case '-':
                c =  a - b;
                break;
            case '%':
                c =  a %b;
                break;
        }

        System.out.println("The result is "+c);

    }
}
