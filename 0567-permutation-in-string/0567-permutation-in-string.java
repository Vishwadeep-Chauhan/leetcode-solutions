class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[]s1Freq=new int[26];
        int[]window=new int[26];
        int k=s1.length();
        for(char c : s1.toCharArray()){
            s1Freq[c-'a']++;
        }
        int l=0;
        for(int r=0;r<s2.length();r++){
            window[s2.charAt(r)-'a']++;
            if(r-l+1>k){
                window[s2.charAt(l)-'a']--;
                l++;
            }
            if(r-l+1==k){
                if(Arrays.equals(s1Freq,window)){
                return true;
            }
            }
        }
        return false;
    }
}