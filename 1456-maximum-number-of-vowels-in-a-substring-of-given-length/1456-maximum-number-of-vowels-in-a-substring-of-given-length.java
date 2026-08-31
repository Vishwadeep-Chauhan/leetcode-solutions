class Solution {
    public int maxVowels(String s, int k) {
        byte[] bytes = s.getBytes();
        int n = bytes.length;
        
        boolean[] isVowel = new boolean[123];
        isVowel['a'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['o'] = true;
        isVowel['u'] = true;
        
        int currentVowels = 0;
        
        for (int i = 0; i < k; i++) {
            if (isVowel[bytes[i]]) {
                currentVowels++;
            }
        }
        
        int maxVowels = currentVowels;
        if (maxVowels == k) {
            return k;
        }
        
        for (int i = k; i < n; i++) {
            if (isVowel[bytes[i]]) {
                currentVowels++;
            }
            if (isVowel[bytes[i - k]]) {
                currentVowels--;
            }
            
            if (currentVowels > maxVowels) {
                maxVowels = currentVowels;
                if (maxVowels == k) {
                    return k;
                }
            }
        }
        
        return maxVowels;
    }
}
