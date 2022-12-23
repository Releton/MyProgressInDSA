package rick.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequences {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        String output = "";
        String input = "abc";
        int index = 0;
        solve(ans, output, input, index);
        System.out.println(ans);
    }
    public static void solve(ArrayList<String> ans, String output, String str, int ind){
        if(ind == str.length()){
            if(output.length() > 0)
                ans.add(output);
            return;
        }
        String gen  = output;
        solve(ans, gen, str, ind+1);

        output += str.charAt(ind);
        gen  = output;
        solve(ans, gen, str, ind + 1);
    }
}
