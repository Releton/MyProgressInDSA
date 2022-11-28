package rick.switches;

import java.util.Scanner;

public class SwitchCaseHw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r100 = 0, r50 = 0, r20 = 1, r1 = 0;
        int totalAmount = sc.nextInt();

        switch (1){
            case 1:
                r100 = totalAmount /100;
                totalAmount = totalAmount%100;
            case 2:
                r50 = totalAmount / 50;
                totalAmount = totalAmount % 50;
            case 3:
                r20 = totalAmount/20;
                totalAmount = totalAmount%20;
            case 4:
                r1 = totalAmount;
                break;
        }
        System.out.printf("%d 100rupees note required\n %d 50rupees note required\n %d 20rupees note required\n %d 1rupee note required\n",r100,r50,r20,r1);

    }
}
