class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            
            if (map.containsKey(currentNum)) {
                int j = map.get(currentNum);
                
                if (i - j <= k) {
                    return true;
                }
            }
            
            map.put(currentNum, i);
        }
        return false;
    }
}