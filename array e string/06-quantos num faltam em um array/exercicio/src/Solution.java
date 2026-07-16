import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
//        HashSet<Integer> count = new HashSet<>();
//        List<Integer> result = new ArrayList<>();
//
//        for (int num : nums) {
//            count.add(num);
//        }
//
//        for (int i = 1; i <= nums.length; i++){
//            if(!count.contains(i)){
//                result.add(i);
//            }
//        }
//
//
//        System.out.println(Arrays.toString(result.toArray()));
//        return result;

//
//      Tempo     O(n)
//      Espaço extra O(1)
        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        System.out.println(Arrays.toString(result.toArray()));
        return result;
    }
}