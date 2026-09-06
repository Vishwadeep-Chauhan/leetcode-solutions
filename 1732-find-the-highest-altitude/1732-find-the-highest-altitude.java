class Solution {
    public int largestAltitude(int[] gain) {
     int[] prefix = new int[gain.length+1];
        int max=0;
        int sum = 0;

        for(int i = 0; i < gain.length; i++){
            sum += gain[i];
            prefix[i+1] = sum;
            
            if(prefix[i+1]>max){
                max=prefix[i+1];
            }

             }
        return max;
    }
}