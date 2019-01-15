class Solution {
    public String minWindow(String s, String t) {
        if(s == null || s.isEmpty())
            return "";
        int[] map = new int[128];
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int count = t.length(), startIndex = 0;
        for(char c : t.toCharArray()) {
            map[c]++;
        }
        while(right < s.length()) {
            if(map[s.charAt(right++)]-- > 0)
                count--;
            while(count == 0) {
                if(right - left < minLen) {
                    minLen = right - left;
                    startIndex = left;
                }
                if(map[s.charAt(left++)]++ == 0)
                    count++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
