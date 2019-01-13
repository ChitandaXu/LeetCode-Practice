class Solution {
    public boolean isNumber(String s) {
        boolean hasE = false;
        boolean hasNum = false;
        boolean hasDecimal = false;
        s = s.trim();
        if(s.length() == 0)
            return false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                hasNum = true;
            } else if(s.charAt(i) == 'E' || s.charAt(i) == 'e') {
                if(hasE || !hasNum)
                    return false;
                if(i == s.length() - 1)
                    return false;
                hasE = true;
            } else if(s.charAt(i) == '.') {
                if(hasE || hasDecimal)
                    return false;
                if(i == s.length() - 1 && !hasNum)
                    return false;
                hasDecimal = true;
            } else if(s.charAt(i) == '+' || s.charAt(i) == '-') {
                if(i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
                if(i == s.length() - 1)
                    return false;
            } else {
                return false;
            }
        }
        return true;
    }
}
