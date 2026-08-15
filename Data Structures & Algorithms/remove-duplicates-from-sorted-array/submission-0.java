class Solution {
    public int removeDuplicates(int[] nums) {
        int output = 0;
        int p1 = 0;
        int p2 = 0;

        while (p2 < nums.length) {
            if (nums[p1] < nums[p2] ) {
                int temp = nums[p1+1];
                nums[p1+1] = nums[p2];
                nums[p2] = temp;
                p1++;
                output++;
            }
            p2++;
        }
        return output + 1;
    }
}