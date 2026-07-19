public class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0, high = 0;
        int zeroCount = 0;
        int maxLength = 0;

        while (high < nums.length) {
            if (nums[high] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[low] == 0) {
                    zeroCount--;
                }
                low++;
            }

            maxLength = Math.max(maxLength, high - low + 1);
            high++;
        }

        return maxLength;
    }
}