package rick.StringsLearn;

public class LearnStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++){
            builder.append((char) ('a'+i));
        }
        System.out.println(builder);
    }
}
