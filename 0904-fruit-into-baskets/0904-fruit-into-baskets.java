class Solution {

    public int totalFruit(int[] fruits) {

        int[] freq = new int[100000]; 
        int low = 0;
        int distinct = 0;
        int maxFruits = 0;

        for(int high = 0; high < fruits.length; high++){

            if(freq[fruits[high]] == 0){
                distinct++;
            }

            freq[fruits[high]]++;

            while(distinct > 2){

                freq[fruits[low]]--;

                if(freq[fruits[low]] == 0){
                    distinct--;
                }

                low++;
            }

            maxFruits = Math.max(maxFruits, high - low + 1);
        }

        return maxFruits;
    }
}