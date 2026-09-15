class Solution {
    public int maxProfit(int[] arr) {
        int mini=arr[0];
        int profit=0;
        int cost=0;
        for (int i = 0; i < arr.length; i++) {
            cost= arr[i]-mini;
            if(cost>profit){
                profit=cost;
            }
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        return profit;
    }
}
