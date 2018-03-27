class Solution {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        int m = 1;
        while (num > 0) {
            int d = num % 10;
            switch(m) {
                case 1:
                    if(d < 4) {
                        for (int i = 0; i < d; i++) {
                            res.insert(0, "I");
                        }
                    } else if (d == 4) {
                        res.insert(0, "IV");
                    } else if (d < 9) {
                        for (int i = 0; i < d - 5; i++) {
                            res.insert(0, "I");
                        }
                        res.insert(0, "V");
                    } else {
                        res.insert(0, "IX");
                    }  
                    break;
                    
                case 2:
                    if(d < 4) {
                        for (int i = 0; i < d; i++) {
                            res.insert(0, "X");
                        }
                    } else if (d == 4) {
                        res.insert(0, "XL");
                    } else if (d < 9) {
                        for (int i = 0; i < d - 5; i++) {
                            res.insert(0, "X");
                        }
                        res.insert(0, "L");
                    } else {
                        res.insert(0, "XC");
                    }
                    break;
                case 3:
                    if(d < 4) {
                        for (int i = 0; i < d; i++) {
                            res.insert(0, "C");
                        }
                    } else if (d == 4) {
                        res.insert(0, "CD");
                    } else if (d < 9) {
                        for (int i = 0; i < d - 5; i++) {
                            res.insert(0, "C");
                        }
                        res.insert(0, "D");
                    } else {
                        res.insert(0, "CM");
                    }
                    break;
                case 4:
                    for (int i = 0; i < d; i++) {
                        res.insert(0, "M");
                    }
                    
            }
            num /= 10;
            m++;
        }
        
        return res.toString();
    }
}