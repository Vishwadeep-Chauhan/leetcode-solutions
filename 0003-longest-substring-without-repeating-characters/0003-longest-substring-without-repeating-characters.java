class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]window=new int[128];
        int l=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            char right=s.charAt(r);
            window[right]++;
            while(window[right]>1){
                char left=s.charAt(l);
                window[left]--;
                l++;
            }
            max=Math.max(max,r-l+1);
}
return max;
    }
}