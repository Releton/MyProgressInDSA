package rick.dsa;

import java.util.Scanner;

public class DSA1Patterns {
    public static long nan = System.currentTimeMillis();
    public static void main(String[] args) throws Exception {
        System.out.println("ENter the number");
        Scanner sc = new Scanner(System.in);
        patterns pattern = new patterns(sc.nextInt());
        pattern.patternHW2();
        pattern.patternHW1();
        pattern.patternHW3();
        pattern.patternHW4();
        pattern.patternHW5();
        pattern.patternHW6();
        pattern.patternHW7();
        pattern.patternHW8();
        pattern.patternHW9();
        pattern.patternHW10();
        pattern.patternHW11();
        pattern.patternHW12();
        pattern.patternHW13();
        pattern.patternHW14();
        System.out.println(System.currentTimeMillis()-nan);
    }

    public static class patterns{
        int n;
        patterns(int n){
            this.n = n;
        }
        public void patternHW2(){
            for(int i = 1; i <= n ; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(i+j-1);
                }
                System.out.println();
            }
        }
        public void patternHW1(){
            int count = 1;
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++){
                    System.out.print((count++));
                }
                System.out.println();
            }
        }
        public void patternHW3(){
            for (int row =1; row<= n; row++){
                for(int col = 1; col<=row;col++){
                    System.out.print(row-col+1);
                }
                System.out.println();
            }
        }
        public void patternHW4(){
            char start = 'A';
            for (int row = 1; row <= n; row++){
                for (int col = 1; col <= n; col++){
                    System.out.print((char) (start+row-1));
                }
                System.out.println();
            }
        }
        public void patternHW5(){
            for(int i = 1; i <= n; i++){
                for (int j = 1; j <= n ; j++){
                    System.out.print( (char) ('A'+j-1));
                }
                System.out.println();
            }
        }
        public void patternHW6(){
            System.out.println("Pattern 6");
            int count = 'A';
            for (int row = 1; row <= n; row++) {
                for (int j = 1; j <= row; j++) {
                    System.out.print((char) (count++));
                }
                System.out.println();
            }
        }
        public void patternHW7(){
            for (int row = 1; row<= n; row++){
                for (int col = 1; col <= row; col++){
                    char ch = (char) ('A'+col+row-2);
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
        public void patternHW8(){
            for (int row = 1; row <= n; row++){
                for (int col = 1; col <= row; col++){
                    System.out.print((char) ((n-row)+col+'A'-1));
                }
                System.out.println();
            }
        }
        public void patternHW9(){
            for(int row = 1; row <= n ; row ++){
                for(int col = 1; col <= n ; col ++){
                    if(n-row<col){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println("------using 2nd method-------");
            for(int i =1; i <= n ; i ++){
                int j = 0;
                for( j = 1; j <= n-i; j++){
                    System.out.print(" ");
                }
                for (; j <= n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
        public void patternHW10(){
            for (int i = n; i > 0 ; i--){
                int j;
                for(j = 1; j <= n-i; j++){
                    System.out.print(" ");
                }
                for(;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public void patternHW11(){
            for(int i = n; i > 0 ; i--){
                for (int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public void patternHW12() throws Exception{
            for (int i = n; i > 0; i--) {
                int j;
                for(j = 1; j <= n-i; j++){
                    System.out.print(" ");
                }
                for (; j <= n; j++) {
                    System.out.print(n-i+1);
                }
                System.out.println();
            }
            System.out.println();
            for(int i = 1 ; i <= n; i++){
                int j;
                for(j = 1; j <= n-i; j++){
                    System.out.print(" ");
                }
                for (;j<=n;j++){
                    System.out.print(i);
                }
                System.out.println();
            }
            System.out.println();
            for(int i = n; i > 0; i--){
                int j;
                for( j = 1; j <= n-i; j++){
                    System.out.print(" ");
                }
                for(; j <= n; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            System.out.println();
            int count = 0;
            for(int i = 1; i <= n; i++){
                int j;
                for( j =1 ; j <= n-i; j++){
                    System.out.print(" ");
                }
                for (; j <= n; j++){
                    System.out.print(++count);
                }
                System.out.println();
            }
            System.out.println();
            for(int i = 1; i <= n; i++){
                int j;
                for(j = 1; j <= n-i; j++){
                    System.out.print(" ");
                }
                for(; j <= n; j++){
                    System.out.print(j-(n-i));
                }
                for (int k = 1;k <= i-1;k++){
                    System.out.print(i-k);
                }
                System.out.println();
            }
            System.out.println("Boss pattern incoming");

            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            System.out.println();

            for(int i = 1; i <= n ; i++){
                int j;
                for(j = 1; j <= n-i+1; j++){
                    System.out.print(j);
                }
                for (;j<=n;j++){
                    System.out.print("*");
                }
                for (;j<=n+i-1;j++){
                    System.out.print("*");
                }
                for (;j <= 2*n; j++){
                    System.out.print(2*n-j+1);
                }
                System.out.println();
            }
            System.out.println();
        }
        public void patternHW13(){
            for(int i = 1; i<= n; i++){
                for(int j = 1 ; j <= n; j++){
                    System.out.print(" "+((i*10)+(j))+" ");
                }
                System.out.println();
            }
        }
        public void patternHW14(){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j<= n-i;j++){
                    System.out.print(" ");
                }
                for(int j = 1; j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
