class Solution {
    public boolean isStrobogrammatic(String num) {
        int len = num.length();
        for(int i = 0; i < (len + 1) / 2; i++){
            if(num.charAt(i) == '0'){
                if(num.charAt(len - i - 1) != '0'){
                    return false;
                }
            } else if(num.charAt(i) == '1'){
                if(num.charAt(len - i - 1) != '1'){
                    return false;
                }
            } else if(num.charAt(i) == '6'){
                if(num.charAt(len - i - 1) != '9'){
                    return false;
                }
            } else if(num.charAt(i) == '8'){
                if(num.charAt(len - i - 1) != '8'){
                    return false;
                }
            } else if(num.charAt(i) == '9'){
                if(num.charAt(len - i - 1) != '6'){
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}