class Solution {
    public int totalFruit(int[] fruits) {
      int [] frfr=new int[fruits.length];
      int max=0;
      int dis=0;
      int l=0;
      for(int r=0;r<fruits.length;r++){
        if(frfr[fruits[r]]==0){
            dis++;
        }
        frfr[fruits[r]]++;
      
while (dis > 2) {
                frfr[fruits[l]]--;
                if (frfr[fruits[l]] == 0) {
                    dis--;
                }
                
                l++;
            }

            max = Math.max(max, r - l + 1);
        
      }
        return max;
    }
}