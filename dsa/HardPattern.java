package rick.dsa;

public class HardPattern
{
    public static void main(String[] args) {
        hardPattern(5);
    }
    public static void hardPattern(int n){
        for(int i = 1; i <= n; i++){
            int j = 1;
            for(;  j <= (n - i) + 1; j++){
                System.out.print(j);
            }
            for(; j <= n; j++){
                System.out.print("*");
            }
            for(; j <= n + i -1; j++){
                System.out.print("*");
            }
            for(; j <= 2 *n; j++){
                System.out.print(n + (j-n)-1);
            }
            System.out.println();
        }
    }
}
