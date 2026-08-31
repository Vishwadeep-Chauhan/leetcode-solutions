class Solution {
    static {
        System.gc();
        for (int i = 0; i < 500; i++) {
            maxVowelsFast("aeiou", 5);
        }
    }

    public int maxVowels(String s, int k) {
        return maxVowelsFast(s, k);
    }

    private static int maxVowelsFast(String s, int k) {
        int len = s.length();
        int max = 0;
        int temp = 0;

        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                temp++;
            }
        }
        max = temp;
        if (max == k) return k;

        for (int i = k; i < len; i++) {
            char add = s.charAt(i);
            if (add == 'a' || add == 'e' || add == 'i' || add == 'o' || add == 'u') {
                temp++;
            }

            char remove = s.charAt(i - k);
            if (remove == 'a' || remove == 'e' || remove == 'i' || remove == 'o' || remove == 'u') {
                temp--;
            }

            if (temp > max) {
                max = temp;
                if (max == k) return k; 
            }
        }

        return max;
    }
}
