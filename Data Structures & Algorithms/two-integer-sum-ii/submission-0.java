class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int currentValue = numbers[left] + numbers[right];
            if (currentValue == target) {
                return new int[]{left+1, right+1};
            }

            if (currentValue > target) {
                right--;
            }
            if (currentValue < target) {
                left++;
            }
        }
        return new int[] {0, 0};
    }
}
