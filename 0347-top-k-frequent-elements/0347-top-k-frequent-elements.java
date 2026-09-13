class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int min=nums[0];
        int max=nums[0];

        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }

        int[] freq=new int[max-min+1];

        for(int i=0;i<nums.length;i++){
            freq[nums[i]-min]++;
        }

        int[] ans=new int[k];
        int index=0;

        for(int count=nums.length;count>=1;count--){

            for(int i=0;i<freq.length;i++){

                if(freq[i]==count){
                    ans[index]=i+min;
                    index++;

                    if(index==k){
                        return ans;
                    }
                }
            }
        }

        return ans;
    }
}