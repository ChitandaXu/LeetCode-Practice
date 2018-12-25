class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            int[] word = new int[26];
            String cur = strs[i];
            for(int j = 0; j < cur.length(); j++) {
                word[cur.charAt(j) - 'a']++; 
            }
            StringBuilder sb = new StringBuilder();
            for(int num : word) {
                sb.append(num);
            }
            String key = sb.toString();
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(cur);
        }
        return new ArrayList<>(map.values());
    }
}
