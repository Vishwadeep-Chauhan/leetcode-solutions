import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] frequencyKey = new char[26];
            for (char c : word.toCharArray()) {
                frequencyKey[c - 'a']++;
            }
            String key = new String(frequencyKey);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}
