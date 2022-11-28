package rick.Leetcode;

import java.util.* ;

public class Add2Arrays {
    public static int[] returnArray(ArrayList<Integer> arr){
        int[] ans = new int[arr.size()];
        for(int i = 0; i < arr.size();i++){
            ans[i] = arr.get(i);
        }
        int s = 0, e = ans.length-1;
        while(s < e){
            int temp = ans[s];
            ans[s] = ans[e];
            ans[e] = temp;
            s++;
            e--;
        }
        return ans;
    }
	public static int[] findArraySum(int[] a, int n, int[] b, int m) {
		int i = n - 1;
        int j = m - 1;
        int carry = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        //Calculating
        while(i >= 0 && j >= 0){
            int sum = a[i--] + b[j--] + carry;
            carry = sum / 10;
            sum %= 10;
            arr.add(sum);
        }
        if(n == m && carry == 0){
            return returnArray(arr);
        }
        if(n > m){
            while(i >= 0){
                int sum = a[i--] + carry;
                carry = sum / 10;
                sum = sum % 10;
                arr.add(sum);
            }
        }
        else if(n < m){
            while( j >= 0){
                int sum = b[j--] + carry;
                carry = sum / 10;
                sum = sum % 10;
                arr.add(sum);
            }
        }
        while(carry!=0){
            int sum = carry;
            carry = sum / 10;
            sum = sum % 10;
            arr.add(sum);
        }
        return returnArray(arr);
	}
}