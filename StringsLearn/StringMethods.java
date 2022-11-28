package rick.StringsLearn;

import java.util.Arrays;

public class StringMethods
{
    public static void main(String[] args) {
        String name = "     Rick     !";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.trim());
        String unCOnt = "Rick ! Mondal";
        System.out.println(Arrays.toString(unCOnt.split("!")));

    }
}
