import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        int[] arr = Arrays.stream(nums).sorted().toArray();
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            if (arr[left] + arr[right] > k) {
                right--;
            } else if (arr[left] + arr[right] < k) {
                left++;
            } else {
                count++;
                left++;
                right--;
            }
        }
        return count;
    }
}


