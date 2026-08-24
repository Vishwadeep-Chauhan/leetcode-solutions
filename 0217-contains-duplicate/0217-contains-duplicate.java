import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
          HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int a=nums[i];
        if(map.containsKey(a)){
            return true;
        }
          map.put(a,1);
      }
      return false;
}
}