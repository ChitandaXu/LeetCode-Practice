class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Deque<String> stack = new LinkedList<>();
        for(String dir : dirs) {
            if(dir.equals("") || dir.equals("."))
                continue;
            if(dir.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        if(stack.isEmpty())
            return "/";
        StringBuilder sb = new StringBuilder("");
        while(!stack.isEmpty()) {
            sb.append("/").append(stack.pollLast());
        }
        return sb.toString();
    }
}
