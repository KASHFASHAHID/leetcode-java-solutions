class Solution {
    public int totalFruit(int[] fruits) {
        int low=0;
        int high=0;
        int maxLength=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(high<fruits.length){
        int fruit = fruits[high];
        map.put(fruit,map.getOrDefault(fruit,0)+1);
        while(map.size()>2){
            int leftfruit = fruits[low];
            map.put(leftfruit,map.get(leftfruit)-1);

            if(map.get(leftfruit)==0){
                map.remove(leftfruit);
            }
            low++;
        }
            maxLength=Math.max(maxLength,high-low+1);
        
        high++;
        
        
        }
        return maxLength;
        
    }

}
