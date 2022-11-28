package rick.functions;

class shoot{
    public Integer a = 10;
}

public class PassByObjj {
    public static void main(String[] args) {
        shoot shot = new shoot();
        System.out.println(shot.a);
        change(shot);
        System.out.println(shot.a);

    }
    public static void change (shoot n){
        n.a = 88;
    }
}