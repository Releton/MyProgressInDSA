package rick.StringsLearn;

public class ReplaceSpaceWith40
{
    public static void main(String[] args) {
        String str = "My name is Rick";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch==' '){
                sb.append("@40");
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
