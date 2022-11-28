package rick.dsa;

public class Lec5 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println(a<<2);
        System.out.println(5>>2);
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(a^b);
        System.out.println();

        int n = 10;
        int x = 0;
        int y = 1;
        for(int i = 1; i <= n; i++){
            int nextNumber = x+y;
            System.out.print(nextNumber+", "+'\n');
            x = y;
            y = nextNumber;
        }


    }
}
