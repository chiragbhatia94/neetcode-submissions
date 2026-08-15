class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : nums) {
            int freq = numsMap.getOrDefault(num, 0);
            numsMap.put(num, freq + 1);
        }

        System.out.println(numsMap);
        Map<Integer, List<Integer>> freqNumMap = new TreeMap<>(Collections.reverseOrder());
        for (int num : numsMap.keySet()) {
            int freq = numsMap.get(num);
            List<Integer> nList = freqNumMap.getOrDefault(freq, new ArrayList<>());
            nList.add(num);
            freqNumMap.put(freq, nList);
        }
        System.out.println(freqNumMap);
        List<Integer> outputList = new ArrayList<>();

        for (Map.Entry<Integer, List<Integer>> entry : freqNumMap.entrySet()) {
            List<Integer> list = entry.getValue();
            // if (list.size() <= k) {
            //     outputList.addAll(list);
            // }
            for (int i : list) {
                outputList.add(i);
                k--;
                if (k == 0) {
                    break;
                }
            }
            if (k == 0) {
                break;
            }
        }
        return outputList.stream().mapToInt(Integer::intValue).toArray();
    }
}
