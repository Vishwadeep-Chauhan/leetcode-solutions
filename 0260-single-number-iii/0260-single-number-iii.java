class Solution {
    public int[] singleNumber(int[] nums) {

        Arrays.sort(nums);

        int[] res = new int[2];
        int ind = 0;

        for(int i = 0; i < nums.length; ) {

            if(i == nums.length - 1 || nums[i] != nums[i + 1]) {
                res[ind] = nums[i];
                ind++;
                i++;
            }
            else {
                i += 2;
            }
        }

        return res;
    }
}