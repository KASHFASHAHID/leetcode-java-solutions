class Solution {

    public int subarrayGCD(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int gcd = 0;

            for (int j = i; j < nums.length; j++) {
                gcd = findGCD(gcd, nums[j]);

                if (gcd == k) {
                    count++;
                }

                if (gcd < k || gcd % k != 0) {
                    break;
                }
            }
        }

        return count;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}