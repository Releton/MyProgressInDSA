package rick.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSets
{
    public static void solve(List<List<Integer>> ans, List<Integer> output, int ind, int[] nums){
        if(ind == nums.length){
            ans.add(output);
            return;
        }
        //exclude
        solve(ans, new ArrayList<>(output), ind + 1, nums);

        //include
        output.add(nums[ind]);
        solve(ans, new ArrayList<>(output), ind + 1, nums);
    }
}
