class Solution {

    public int getMaxLen(int[] nums) {

        int max = 0;

        int start = 0;
        int negative = 0;

        int firstNegative = -1;
        int lastNegative = -1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){

                start = i + 1;
                negative = 0;
                firstNegative = -1;
                lastNegative = -1;

            }
            else{

                if(nums[i] < 0){

                    negative++;

                    if(firstNegative == -1){
                        firstNegative = i;
                    }

                    lastNegative = i;
                }

                if(negative % 2 == 0){

                    max = Math.max(max, i - start + 1);

                }
                else{

                    int leftRemove = i - firstNegative;
                    int rightRemove = lastNegative - start;

                    max = Math.max(max, Math.max(leftRemove, rightRemove));
                }
            }
        }

        return max;
    }
}