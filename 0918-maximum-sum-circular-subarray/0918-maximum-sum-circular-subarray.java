class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int res=nums[0]; 
        int cur=nums[0]; 
        for(int i=1;i<nums.length;i++){
            cur=Math.max(nums[i],cur+nums[i]);
            res=Math.max(res,cur);
             }
        int a=nums[0]; 
        int b=nums[0]; 
        for(int i=1;i<nums.length;i++){
            a=Math.min(nums[i],a+nums[i]);
            b=Math.min(b,a);
             }
             int cir=total-b;
             int ans=Math.max(cir,res);
             if(total == b){
            return res;
            }
    
             return ans;
    }
}