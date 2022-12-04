package rick.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueOccurances {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i  = 0; i < arr.length;){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]!=arr[j]){
                    break;
                }
                count++;
            }
            ans.add(count);
            i += count;
        }
        Collections.sort(ans);
        for(int i = 0; i < ans.size()-1; i++){
            if(ans.get(i) == ans.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
