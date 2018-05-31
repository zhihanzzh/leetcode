/*
Using increasing numbers as codes like that is simple but has some disadvantages, which the below solution fixes:

If I'm asked to encode the same long URL several times, it will get several entries. That wastes codes and memory.
People can find out how many URLs have already been encoded. Not sure I want them to know.
People might try to get special numbers by spamming me with repeated requests shortly before their desired number comes up.
Only using digits means the codes can grow unnecessarily large. Only offers a million codes with length 6 (or smaller). Using six digits or lower or upper case letters would offer (10+26*2)6 = 56,800,235,584 codes with length 6.

*/


public class Codec {

    String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    HashMap<String, String> map = new HashMap<>();
    int count = 1;
    // Encodes a URL to a shortened URL.
    public String getString() {
        int c = count;
        StringBuilder sb = new StringBuilder();
        while (c > 0) {
            c--;
            sb.append(chars.charAt(c % 62));
            c /= 62;
        }
        return sb.toString();
    }
    public String encode(String longUrl) {
        String key = getString();
        map.put(key, longUrl);
        count++;        
        return "http://tinyurl.com/" + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl.replace("http://tinyurl.com/", ""));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));