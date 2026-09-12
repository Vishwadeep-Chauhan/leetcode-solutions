class Solution {
    public int[] sortedSquares(int[] nums) {
       int l=0;
       int r=nums.length-1;
       int i=nums.length-1;
       int max=0;
       int[] res=new int[nums.length];
       while(l<=r){
        int a=nums[l]*nums[l];
        int b=nums[r]*nums[r];
        if(a<b){
            max=b;
        res[i]=max;
        r--;
        }
        else{
            max=a;
            res[i]=max;
            l++;
        }
        
        i--;
       } 
       return res;
    }
}