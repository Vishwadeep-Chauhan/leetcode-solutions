class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = 0;
        

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        
        int low = 1;
        int high = max;
        
        while (low <= high) {
            
            int mid = low + (high - low) / 2;
            
            long hours = 0;
            
            for (int i = 0; i < piles.length; i++) {
                
                hours += piles[i] / mid;
                
                if (piles[i] % mid != 0) {
                    hours++;
                }
            }
            
            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
}