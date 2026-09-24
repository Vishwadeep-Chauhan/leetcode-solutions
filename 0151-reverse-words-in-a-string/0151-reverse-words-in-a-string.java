class Solution {
    public String reverseWords(String s) {

        String result = "";
        int i = s.length() - 1;

        while(i >= 0) {

            while(i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if(i < 0) {
                break;
            }

            int end = i;

            while(i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            for(int j = i + 1; j <= end; j++) {
                result += s.charAt(j);
            }

            result += " ";
        }

        if(result.length() > 0) {
            result = result.substring(0, result.length() - 1);
        }

        return result;
    }
}