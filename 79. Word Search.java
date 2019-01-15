class Solution {
    public boolean exist(char[][] board, String word) {
        if(word == null || word.length() == 0 || board.length == 0 || board[0].length == 0)
            return false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(isValid(board, i, j, word, 0, visited))
                    return true;
            }
        }
        return false;
    }
    
    private boolean isValid(char[][] board, int i, int j, String word, int index, boolean[][] visited) {
        if(index == word.length())
            return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || word.charAt(index) != board[i][j] || visited[i][j])
            return false;
        visited[i][j] = true;
        if(isValid(board, i + 1, j, word, index + 1, visited) 
           || isValid(board, i - 1, j, word, index + 1, visited) 
           || isValid(board, i, j - 1, word, index + 1, visited) 
           || isValid(board, i, j + 1, word, index + 1, visited))
            return true;
        visited[i][j] = false;
        return false;
    }
}
