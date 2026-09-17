class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced =0;

        for(int fruit : fruits){

            boolean placed = false;

            for(int j=0; j< baskets.length; j++){
                if(baskets[j]>= fruit){
                    placed = true;
                    baskets[j] = -1;
                    break;
                }
            }

            if(!placed){
                unplaced++;
            }

        }
        return unplaced;
    }
}