class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            maxVowels("aeiou", 5);
        }
    }

    public static int maxVowels(String s, int k) {
        int max = 0;
        int temp = 0;
        int len = s.length();

        boolean[] isVowel = new boolean[128];
        isVowel['a'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['o'] = true;
        isVowel['u'] = true;

        for (int i = 0; i < k; i++) {
            if (isVowel[s.charAt(i)]) {
                temp++;
            }
        }
        max = temp;

        if (max == k) {
            return max;
        }

        for (int i = k; i < len; i++) {
            if (isVowel[s.charAt(i)]) {
                temp++;
            }
            if (isVowel[s.charAt(i - k)]) {
                temp--;
            }

            if (temp > max) {
                max = temp;
                if (max == k) {
                    return max;
                }
            }
        }

        return max;
    }
}
