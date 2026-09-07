class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];
        int k=p.length();
        for(char c: p.toCharArray()){
            pFreq[c-'a']++;
        }
        int l=0;
        for(int r=0;r<s.length();r++){
            windowFreq[s.charAt(r)-'a']++;
            if(r-l+1>k){
                windowFreq[s.charAt(l)-'a']--;
                l++;
            }
            if(r-l+1==k){
               if( Arrays.equals(pFreq,windowFreq)){
                    result.add(l);
                    }
            }
        }
        return result;
       
    }
}