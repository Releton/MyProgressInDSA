package rick.Recursion;

import java.util.Arrays;
import java.util.List;

public class NumberKeypad {
    public static void solve(List<String> ans, String output,String digits, String[] mapping, int index){
        if(index == digits.length()){
            ans.add(output);
            return;
        }

        int number = digits.charAt(index) - '0';
        String val = mapping[number];

        for(int i= 0; i < val.length();i++){
            output += val.charAt(i);

            solve(ans, new String(output),digits,mapping, index + 1);

            output = output.substring(0, output.length()-1);
        }
    }
}
