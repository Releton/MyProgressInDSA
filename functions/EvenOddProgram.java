package rick.functions;

public class EvenOddProgram {
    public static void main(String[] args) {
        System.out.println(isEven(3));
    }

    public static boolean isEven(int x){
        return x % 2 ==0;
    }
}
