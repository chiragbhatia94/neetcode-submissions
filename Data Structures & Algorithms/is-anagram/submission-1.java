class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> chars = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (char c: charArray) {
            if (chars.containsKey(c)) {
                chars.put(c, chars.get(c) + 1);
            } else {
                chars.put(c, 1);
            }
        }

        for (char c: t.toCharArray()) {
            if (chars.containsKey(c)) {
                int count = chars.get(c);
                if (count == 1) {
                    chars.remove(c);
                } else {
                    chars.put(c, count-1);
                }
            } else {
                return false;
            }
        } 
        if (chars.isEmpty()) {
            return true;
        } 
        return false;
    }
}
