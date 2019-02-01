class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int left = 0, right = 0;
        int res = 0;
        int[] map = new int[128];
        while(right < s.length()) {
            if(map[s.charAt(right)] == 0) {
                map[s.charAt(right++)]++;
                res = Math.max(res, right - left);
            } else {
                while(map[s.charAt(right)] != 0) {
                    map[s.charAt(left++)]--;
                }
            }
        }
        return res;
    }
}