class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0;
        int min=0;
        int max=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        max=Math.max(max,sum);
        min=Math.min(min,sum);
     }  
     return max-min; 
    }
}