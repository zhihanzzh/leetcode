class Solution {
    class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word;
    }
    
    private TrieNode build(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode start = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (start.next[c - 'a'] == null) {
                    start.next[c - 'a'] = new TrieNode();
                }
                start = start.next[c - 'a'];
            }
            start.word = word;
        }
        
        return root;
    }
    
    private void dfs(char[][] board, int x, int y, TrieNode root, List<String> res, String[] words) {
        char c = board[x][y];
        if (c == '*' || root.next[c - 'a'] == null) {
            return;
        }
        root = root.next[c - 'a'];
        if(root.word != null) {
            res.add(root.word);
            root.word = null;
        }
        
        board[x][y] = '*';
        
        if (x > 0) {
            dfs(board, x - 1, y, root, res, words);
        }
        if (y > 0) {
            dfs(board, x, y - 1, root, res, words);
        }
        if (x < board.length - 1) {
            dfs(board, x + 1, y, root, res, words);
        }
        if (y < board[0].length - 1) {
            dfs(board, x, y + 1, root, res, words);
        }
        board[x][y] = c;
    }
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<String>();
        if (words == null || words.length == 0) {
            return res;
        }
        TrieNode root = build(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, res, words);
            }
        }
        
        return res;
        
        
    }
}