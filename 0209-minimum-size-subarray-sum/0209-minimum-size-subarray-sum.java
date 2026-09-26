class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int answer = Integer.MAX_VALUE;
        while(high < nums.length){
            sum = sum+nums[high];

            while(sum >= target){
                answer=Math.min(answer,high-low+1);
                
                sum = sum - nums[low];
                low++;

            }
            high++;
            
        }
        return answer==Integer.MAX_VALUE?0:answer;

    }
}