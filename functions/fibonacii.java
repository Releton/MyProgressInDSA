package rick.functions;
import rick.utilities.UFeatures;
public class fibonacii {
    public static void main(String[] args){
        int n = UFeatures.inInt("Enter the number of index to get the fibonacci of");
        System.out.println(fib(n));
    }

    static public int fib(int n){
        switch (n){
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return fib(n-1)+fib(n-2);
        }
    }
}