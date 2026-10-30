class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;

        while (left < nums.length - 1) {

            int right = left + 1;

            while (right < nums.length) {

                int sum = nums[left] + nums[right];

                if (sum == target) {
                    return new int[]{left, right};
                }

                right++;
            }

            left++;
        }

        return new int[]{-1, -1};
    }
}