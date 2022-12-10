vector<vector<int>> findTriplets(vector<int>arr, int n, int K) {
	vector<vector<int>> ans;

    sort(arr.begin(), arr.end());
    for(int i = 0; i < n; i++){
        int target = K - arr[i];
        int s = i + 1;
        int e = n-1;
        while(s < e){
            if(arr[s] + arr[e] < target){
                s ++;
            }
            else if(arr[s] + arr[e] > target){
                e--;
            }
            else{
                int x = arr[s];
                int y = arr[e];
                ans.push_back({arr[i], arr[s], arr[e]});
                while(s < e && arr[s] == x){
                    s++;
                }
                while(e > s && arr[e] == y){
                    e--;
                }

            }
        }
        while(i < n-1 && arr[i] == arr[i+1]){
            i++;
        }
    }
    return ans;
}