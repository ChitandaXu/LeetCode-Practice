class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int x = (i >= 0) ? a.charAt(i) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            if(i >= 0)
                i--;
            if(j >= 0)
                j--;
        }
        if(carry != 0)
            sb.append(1);
        return sb.reverse().toString();
    }
}
