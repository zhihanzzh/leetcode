class Solution {
    public boolean canPermutePalindrome(String s) {
	HashSet<Character> odd = new HashSet<Character>();
	for(int i=0; i<s.length(); i++){
		if(odd.contains(s.charAt(i)))	odd.remove(s.charAt(i));
		else	odd.add(s.charAt(i));
	}
	return odd.size()<2;
    }
}