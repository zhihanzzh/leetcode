class Solution {
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0) {
            return true;
        }
        boolean[][] used = new boolean[board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (tracking(board, used, word, i, j, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean tracking(char[][] board, boolean[][] used, String word, int i, int j, int idx) {
        if (idx == word.length()) {
            return true;
        } else if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || used[i][j] || board[i][j] != word.charAt(idx)) {
            return false;
        }  else {
            used[i][j] = true;
            boolean ans = tracking(board, used, word, i - 1, j, idx + 1) || tracking(board, used, word, i + 1, j, idx + 1) || tracking(board, used, word, i, j + 1, idx + 1) || tracking(board, used, word, i, j - 1, idx + 1);
            used[i][j] = false;
            return ans;
        }
        
    }
}