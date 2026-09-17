class Solution {
    public void nextPermutation(int[] nums) {
         int n = nums.length;
        int index = -1;

        // Find first smaller number from the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // If array is in descending order
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Find the next greater number from the right
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        // Reverse the remaining part
        reverse(nums, index + 1, n - 1);
    }

    void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
