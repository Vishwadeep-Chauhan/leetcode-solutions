class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        
        int[] targetFreq = new int[128]; 
        for (char c : t.toCharArray()) {
            targetFreq[c]++;
        }
        
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int matchedChars = 0; 
        
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            
            if (targetFreq[rightChar] > 0) {
                matchedChars++;
            }
            targetFreq[rightChar]--; 
            right++; 
            
            while (matchedChars == t.length()) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }
                
                char leftChar = s.charAt(left);
                targetFreq[leftChar]++; 
                
                if (targetFreq[leftChar] > 0) {
                    matchedChars--;
                }
                left++; 
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}