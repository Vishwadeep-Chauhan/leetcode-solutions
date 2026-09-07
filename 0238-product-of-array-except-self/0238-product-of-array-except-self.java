class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int[] left=new int[nums.length];
        for(int l=0;l<nums.length;l++){
           left[l]=pro;
           pro*=nums[l];
            
        }
        int pro1=1;
        int[] right=new int[nums.length];
        for(int r=nums.length-1;r>=0;r--){
           right[r]=pro1;
            pro1*=nums[r];
            
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=left[i]*right[i];
    }
    return ans;
    }
}