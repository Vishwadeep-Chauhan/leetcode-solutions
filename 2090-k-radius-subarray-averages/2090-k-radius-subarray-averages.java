class Solution {

    public int[] getAverages(int[] nums, int k) {

        int n=nums.length;

        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=-1;
        }

        int size=2*k+1;

        if(size>n){
            return ans;
        }

        long sum=0;

        for(int i=0;i<size;i++){
            sum+=nums[i];
        }

        int l=0;
        int r=size-1;

        ans[l+k]=(int)(sum/size);

        while(r<n-1){

            sum-=nums[l];
            l++;

            r++;
            sum+=nums[r];

            ans[l+k]=(int)(sum/size);
        }

        return ans;
    }
}