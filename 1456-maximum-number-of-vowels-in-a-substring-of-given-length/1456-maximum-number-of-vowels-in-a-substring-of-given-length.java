class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int maxVowels = 0;
        int currentVowels = 0;

        boolean[] isVowel = new boolean[123];
        isVowel['a'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['o'] = true;
        isVowel['u'] = true;

        for (int i = 0; i < n; i++) {
            
            if (isVowel[s.charAt(i)]) {
                currentVowels++;
            }
            
            if (i >= k && isVowel[s.charAt(i - k)]) {
                currentVowels--;
            }
            if (currentVowels > maxVowels) {
                maxVowels = currentVowels;
            }

            if (maxVowels == k) {
                return k;
            }
        }

        return maxVowels;
    }
}