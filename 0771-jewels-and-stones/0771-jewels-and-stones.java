class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int []freq1= new int[256];
        int []freq2= new int[256];
        int count=0;
        for (int i=0;i<stones.length();i++){
            char ch1 = stones.charAt(i);
            freq1[ch1]+=1;
        }
        for (int i =0;i<jewels.length();i++){
            char ch2 = jewels.charAt(i);
            freq2[ch2]+=1;
        }
        for (int i=0;i<256;i++){
          if (freq2[i]>0){
            count+=freq1[i];
          }
        }
        return count;
    }
}