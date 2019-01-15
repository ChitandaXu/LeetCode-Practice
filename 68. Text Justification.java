class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int index = 0;
        while(index < words.length) {
            int count = words[index].length();
            int last = index + 1;
            while(last < words.length) {
                if(words[last].length() + count + 1 > maxWidth)
                    break;
                count += 1 + words[last].length();
                last++;
            }
            StringBuilder sb = new StringBuilder();
            int diff = last - index - 1;
            if(last == words.length || diff == 0) {
                for(int i = index; i < last - 1; i++) {
                    sb.append(words[i] + " ");
                }
                sb.append(words[last - 1]);
                for(int i = sb.length(); i < maxWidth; i++) {
                    sb.append(" ");
                }
            }
            else {
                int spaces = (maxWidth - count) / diff;
                int r = (maxWidth - count) % diff;
                for(int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if(i < last - 1) {
                        for(int j = 0; j <= (spaces + ((i - index) < r ? 1 : 0)); j++)
                            sb.append(" ");
                    }
                }
            }
            res.add(sb.toString());
            index = last;
        }
        return res;
    }
}
