import java.util.*;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
//        double maxValue = Double.NEGATIVE_INFINITY;
//        int left = 0;
//        int right = k;
//
//        while (right <= nums.length){
//            int [] subArray = Arrays.copyOfRange(nums, left, right);
//            maxValue = Math.max(Arrays.stream(subArray).average().orElse(0), maxValue);
//            left++;
//            right++;
//        }
//        return maxValue;
//    }

        int maxAvg;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAvg = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (sum > maxAvg) {
                maxAvg = sum;
            }
        }

        return (double) maxAvg / k;
    }
}


