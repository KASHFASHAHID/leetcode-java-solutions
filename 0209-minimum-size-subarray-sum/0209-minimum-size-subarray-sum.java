import java.util.*;

class Solution {

    public static int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int low = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int high = 0; high < n; high++) {
            sum += arr[high];

            while(sum >= target) {
                minLen = Math.min(minLen, high - low + 1);
                sum -= arr[low];
                low++;
            }
        }

        if(minLen == Integer.MAX_VALUE)
            return 0;

        return minLen;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        int result = minSubArrayLen(target, arr);
        System.out.println("Minimum subarray length = " + result);
    }
}
