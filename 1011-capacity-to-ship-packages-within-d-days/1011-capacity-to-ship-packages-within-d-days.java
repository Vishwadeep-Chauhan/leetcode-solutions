class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int start=0;
        int end=0;

        for(int i=0;i<weights.length;i++){

            start=Math.max(start,weights[i]);
            end+=weights[i];
        }

        while(start<end){

            int mid=start+(end-start)/2;

            int current=0;
            int day=1;

            for(int i=0;i<weights.length;i++){

                if(current+weights[i]>mid){

                    day++;
                    current=0;
                }

                current+=weights[i];
            }

            if(day>days){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }

        return start;
    }
}