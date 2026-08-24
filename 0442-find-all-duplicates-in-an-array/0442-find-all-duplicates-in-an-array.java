
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
               List<Integer> result = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (map.containsKey(currentNum)) {
                result.add(currentNum);
            } else {
                map.put(currentNum, true);
            }
        }
        
        return result; 
    }
}