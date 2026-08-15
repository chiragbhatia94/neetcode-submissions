class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str: strs) {
            int[] freq = new int[26];
            for (char c: str.toCharArray()) {
                int pos = (int) c - 97;
                freq[pos] = freq[pos] + 1;
            }
            String key = "";
            for (int f: freq) {
                key += "_" + String.valueOf(f);
            }
            // System.out.println(Arrays.toString(freq) + ": " + key);
            List<String> anagramsList = anagrams.getOrDefault(key, new ArrayList<>());
            anagramsList.add(str);
            anagrams.put(key, anagramsList);
        }

        List<List<String>> finalOutput = new ArrayList<>();
        for (List<String> anagramList : anagrams.values()) {
            finalOutput.add(anagramList);
        }
        return finalOutput;
    }
}
