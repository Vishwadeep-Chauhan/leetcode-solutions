class Solution {
    public String convertToBase7(int num) {
        if(num == 0) {
            return "0";
        }

        boolean negative = false;

        if(num < 0) {
            negative = true;
            num = -num;
        }

        String ans = "";

        while(num > 0) {
            int rem = num % 7;
            ans = rem + ans;
            num = num / 7;
        }

        if(negative) {
            ans = "-" + ans;
        }

        return ans;
    }
}