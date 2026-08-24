import java.util.HashMap;
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            if(map.containsKey(current)){
            map.put(current,map.get(current)+1);
        }
        else{
            map.put(current,1);
        }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            if(map.get(current)==1){
                sum+=current;
            }
        }
        return sum;
    }
}