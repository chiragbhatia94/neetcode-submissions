class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int size = str.length();
        int left = 0;
        int right = size - 1;
        int i = 0;
        while(i<size/2) {
            if (str.charAt(left+i) != str.charAt(right-i)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
