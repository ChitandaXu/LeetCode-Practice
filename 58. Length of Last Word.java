class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int index = s.length() - 1;
        while(index >= 0 && s.charAt(index) == ' ')
            index--;
        int count = 0;
        while(index >= 0 && s.charAt(index) != ' ') {
            index--;
            count++;
        }
        return count;
    }
}
