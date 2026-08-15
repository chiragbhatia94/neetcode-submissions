class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
            int num = nums[i];
            List<Integer> positions = map.getOrDefault(num, new ArrayList<>());
            positions.add(i);
            map.put(num, positions);
        }

        for (int i = 0; i< nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (map.containsKey(diff)) {
                List<Integer> positions = map.get(diff);
                if (num == diff) {
                    if (positions.size() > 1) {
                        positions.remove(0);
                        return new int[] {i, positions.get(0)};
                    }
                } else {
                    return new int[] {i, positions.get(0)};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
