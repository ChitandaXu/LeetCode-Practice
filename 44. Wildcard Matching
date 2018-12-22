class Solution {
    public boolean isMatch(String s, String p) {
        if(s == null && p == null)
            return true;
        if(s == null || p == null)
            return false;
        if(p.isEmpty())
            return s.isEmpty();
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[s.length()][p.length()] = true;
        for(int i = s.length(); i >= 0; i--) {
            for(int j = p.length() - 1; j >= 0; j--) {
                boolean first_match = i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?');
                if(p.charAt(j) == '*') {
                    dp[i][j] = (i == s.length()) ? dp[i][j+1] : (dp[i+1][j] || dp[i][j+1]);
                } else {
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }
        return dp[0][0];
    }
}
