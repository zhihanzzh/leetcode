class Solution {
    public String[] findWords(String[] words) {
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        Set<Character> set3 = new HashSet<Character>();
        
        set1.add('q');
        set1.add('w');
        set1.add('e');
        set1.add('r');
        set1.add('t');
        set1.add('y');
        set1.add('u');
        set1.add('i');
        set1.add('o');
        set1.add('p');
        set1.add('Q');
        set1.add('W');
        set1.add('E');
        set1.add('R');
        set1.add('T');
        set1.add('Y');
        set1.add('U');
        set1.add('I');
        set1.add('O');
        set1.add('P');
        
        set2.add('a');
        set2.add('s');
        set2.add('d');
        set2.add('f');
        set2.add('g');
        set2.add('h');
        set2.add('j');
        set2.add('k');
        set2.add('l');
        set2.add('A');
        set2.add('S');
        set2.add('D');
        set2.add('F');
        set2.add('G');
        set2.add('H');
        set2.add('J');
        set2.add('K');
        set2.add('L');
        
        set3.add('z');
        set3.add('x');
        set3.add('c');
        set3.add('v');
        set3.add('b');
        set3.add('n');
        set3.add('m');
        set3.add('Z');
        set3.add('X');
        set3.add('C');
        set3.add('V');
        set3.add('B');
        set3.add('N');
        set3.add('M');
        
        List<String> result = new LinkedList<String>();
        
        outer : for(int i = 0; i < words.length; i++){
            char c = words[i].charAt(0);
            if(set1.contains(c)){
                for(int j = 1; j < words[i].length(); j++){
                    c = words[i].charAt(j);
                    if(!set1.contains(c)){
                        continue outer;
                    }
                }
                result.add(words[i]);
            } else if (set2.contains(c)) {
                for(int j = 1; j < words[i].length(); j++){
                    c = words[i].charAt(j);
                    if(!set2.contains(c)){
                        continue outer;
                    }
                }
                result.add(words[i]);
            } else if (set3.contains(c)) {
                for(int j = 1; j < words[i].length(); j++){
                    c = words[i].charAt(j);
                    if(!set3.contains(c)){
                        continue outer;
                    }
                }
                result.add(words[i]);
            }
        }
        
        String[] resultStr = new String[result.size()];
        for(int i = 0; i < result.size(); i++){
            resultStr[i] = result.get(i);
        }
        
        return resultStr;
    }
}