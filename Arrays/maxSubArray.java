class Solution {
    public int maxSubArray(int[] arr) {
        int maxi = arr[0];
        int sum = 0;

        for (int num : arr) {
            sum += num;
            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }
}
