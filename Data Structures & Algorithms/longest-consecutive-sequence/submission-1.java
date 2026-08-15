class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        Map<Integer, Integer> sequences = new HashMap<>();
        for (int num: nums) {
            numSet.add(num);
        }
        for (int num: nums) {
            if (!numSet.contains(num-1)) {
                sequences.put(num, 0);
            }
        }
        for (int num: sequences.keySet()) {
            int t = num;
            while(numSet.contains(t)) {
                sequences.put(num, sequences.get(num) + 1);
                t++;
            }
        }
        int longestSequence = 0;
        for (Map.Entry<Integer, Integer> entry: sequences.entrySet()) {
            if (entry.getValue() > longestSequence) {
                longestSequence = entry.getValue();
            }
        }
        return longestSequence;
    }
}
