package rick.functions;

public class functions1 {
    public static void main(String[] args){
        System.out.println(pow(12,2));
    }
    public static int pow(int a, int b){
        int ans = 1;
        for(int i = 1; i <= b; i++){
            ans *= a;
        }
        return ans;
    }
}
