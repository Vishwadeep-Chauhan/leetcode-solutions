import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String prevWord = result.get(result.size() - 1);
            String currWord = words[i];
            
            if (!isAnagram(prevWord, currWord)) {
                result.add(currWord);
            }
        }
        
        return result;
    }
    
    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }
}
