class Solution {
    public int compress(char[] chars) {
        String res="";
        for(int i=0;i<chars.length;){
            char ch=chars[i];
            int count=0;
            for(int j=i;j<chars.length;j++){
                if(chars[j]==ch){
                    count++;
                }
                else{
                    break;
                }
            }
            res+=ch;
            if(count>1){
                res+=count;
            }
            i+=count;
        }
        for(int i = 0; i < res.length(); i++) {
            chars[i] = res.charAt(i);
        }
        return res.length();
    }
}