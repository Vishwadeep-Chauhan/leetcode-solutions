class Solution {
    public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       int st=0;
       int end=s.length()-1;
       while(st<=end){
        if(s.charAt(st)!=s.charAt(end)){
            return false;
        }
        st++;
        end--;;
       }
       return true;
    }
}