import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] freq = new int[26];
            char[] chars = str.toCharArray();
            for(char ch:chars){
                freq[ch - 'a']++;
            }
            StringBuilder k = new StringBuilder();
            for(int n:freq){
                k.append(n).append('#');
            }
            String key = k.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}