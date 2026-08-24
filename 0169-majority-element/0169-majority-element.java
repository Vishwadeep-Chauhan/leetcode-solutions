import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
      int maj=nums.length/2;
      for(int i=0;i<nums.length;i++){
        int cur=nums[i];
        if(map.containsKey(cur)){
            map.put(cur,map.get(cur)+1);
        }
        else{
            map.put(cur,1);
        }
        if(map.get(cur)>maj){
            return cur;
        }
      }  
      return -1;
    }
}