package rick.StringsLearn;

public class StringComparisons {
    public static void main(String[] args) {
        String a = "Rick";
        String b = "Rick";
        System.out.println("The comparison between a and b is: "+ (a==b));
        //Returns ^ true because only once Rick is being created in pool and then a and b are pointing to the same thing
        String num1 = new String("Debaditya"); //Explicitly creating string outside pool
        String num2 = new String("Debaditya");
        System.out.println("The comparison between num1 and num2 is: "+(num2==num1));
        //Although the value was same both the reference variable are pointing towards different objects
        System.out.println("The comparison between num1 and num2 using equals() is: "+ (num1.equals(num2)));
        //Returns true because it does not cares if the objects are different it cares about the value
    }
}
