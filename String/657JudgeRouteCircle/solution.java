class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char cur = moves.charAt(i);
            if (cur == 'R') {
                x++;
            } else if (cur == 'L') {
                x--;
            } else if (cur == 'U') {
                y++;
            } else {
                y--;
            }
        }
        
        if (y == 0 && x == 0) {
            return true;
        } else {
            return false;
        }
    }
}