class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEndingHere = 0, maxSum = 0;
        int minEndingHere = 0, minSum = 0;

        for (int num : nums) {
            maxEndingHere = Math.max(num, maxEndingHere + num);
            maxSum = Math.max(maxSum, maxEndingHere);

            
            minEndingHere = Math.min(num, minEndingHere + num);
            minSum = Math.min(minSum, minEndingHere);
        }

        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}