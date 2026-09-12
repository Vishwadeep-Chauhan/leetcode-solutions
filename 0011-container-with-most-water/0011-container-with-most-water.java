class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        int water=0;
        while(l<r){
             water = (r - l) * Math.min(height[l], height[r]);
            max = Math.max(max, water);
           if(height[l] < height[r]){
            l++;
            }
            else if(height[l] > height[r]){
            r--;
            }
            else{
                l++;
            } 
        }
        return max;
    }
}