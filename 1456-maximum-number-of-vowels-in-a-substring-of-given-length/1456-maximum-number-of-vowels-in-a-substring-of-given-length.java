class Solution {
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int max = 0;
        int temp = 0;

        for (int i = 0; i < k; i++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                temp++;
            }
        }
        max = temp;

        if (max == k) {
            return max;
        }

        for (int i = k; i < chars.length; i++) {
            char add = chars[i];
            char remove = chars[i - k];

            if (add == 'a' || add == 'e' || add == 'i' || add == 'o' || add == 'u') {
                temp++;
            }
            if (remove == 'a' || remove == 'e' || remove == 'i' || remove == 'o' || remove == 'u') {
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
