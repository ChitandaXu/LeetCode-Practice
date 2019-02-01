class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return s;
        int left = 0, right = 0;
        for(int i = 0; i < s.length(); i++) {
            int len1 = computeLength(s, i, i);
            int len2 = computeLength(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > right - left) {
                left = i - (len - 1) / 2;
                right = i + len / 2;
            }
        }
        return s.substring(left, right + 1);
    }
    
    private int computeLength(String s, int left, int right) {
        while(left >= 0 && right <= s.length() - 1 &&
              s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}