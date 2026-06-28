import java.util.Arrays;

class Solution {
    public int[] shuffle(int[] nums, int n) {
//        int halfNumsLength = (nums.length / 2);
//        int[] left = new int[halfNumsLength];
//        int[] right = new int[halfNumsLength];
//        int[] result = new int[nums.length];
//        System.arraycopy(nums, 0, left, 0, halfNumsLength);
//        System.arraycopy(nums, halfNumsLength, right, 0, halfNumsLength);
//        for (int i = 0; i < left.length; i++) {
//            result[i * 2] = left[i];
//            result[i * 2 + 1] = right[i];
//        }
//        System.out.println(Arrays.toString(result));
//        return result;

        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
