class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int countOfZero = 0;
        for (int num: nums) {
            if (num == 0) {
                countOfZero++;
                continue;
            }
            product *= num;
        }

        if (countOfZero > 1) {
            return new int[nums.length];
        }

        int newArray[] = new int[nums.length];
        for (int i =0; i<nums.length; i++) {
            if (nums[i] == 0) {
                newArray[i] = product;
            } else {
                if (countOfZero == 0){
                newArray[i] = product/nums[i];}
            }
        }
        return newArray;

        // if (nums.length == 0) {
        //     return nums;
        // }

        // int [] forwardProduct = new int[nums.length];
        // int countOfZero = nums[0] == 0 ? 1: 0;
        // forwardProduct[0] = nums[0];
        // int product = 1;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0) {
        //         countOfZero++;
        //     }
        //     if (countOfZero > 1) {
        //         return new int[nums.length];
        //     }
        //     product *= nums[i]; 
        //     forwardProduct[i] = product;
        // }
        // int [] reverseProduct = new int[nums.length];
        // product=1;
        // for (int i = nums.length-1; i>=0; i--) {
        //     product*=nums[i];
        //     reverseProduct[i] = product;
        // }
        // // System.out.println(Arrays.toString(forwardProduct));
        // // System.out.println(Arrays.toString(reverseProduct));
        // int[] newArray = new int[nums.length];
        // newArray[0] = reverseProduct[1]; 
        // for (int i = 1; i < nums.length-1; i++) {
        //     newArray[i] = forwardProduct[i-1] * reverseProduct[i+1];
        // }
        // newArray[nums.length - 1] = forwardProduct[nums.length - 2];

        // return newArray;
    }
}  
