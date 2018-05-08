class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (String s : cpdomains) {
            String[] info = s.split("\\s+");
            int count = Integer.valueOf(info[0]);
            String[] domain = info[1].split("\\.");
            String cur = "";
            for (int i = domain.length - 1; i >= 0; i--) {
                cur = domain[i] + (i < domain.length - 1 ? "." : "") + cur;
                map.put(cur, map.getOrDefault(cur, 0) + count);
            }
        }
        
        List<String> res = new ArrayList<String>();
        
        for (String s : map.keySet()) {
            res.add(map.get(s) + " " + s);
        }
        
        return res;
    }
}