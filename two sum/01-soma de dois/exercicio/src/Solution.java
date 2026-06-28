import java.util.*;


class Solution {
    public int[] twoSum(int[] nums, int target) {

//       Complexidade O(n)^2 = muito menos eficaz
//        HashMap<Integer, Integer> count = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
//                if (entry.getValue().equals(nums[i])) {
//                    return new int[]{entry.getKey(), i};
//                }
//            }
//            count.put(i, target - nums[i]);
//        }
//        return null;

        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])){
                return new int[] {count.get(nums[i]), i};
            };
            count.put(target - nums[i], i);
        }
        return null;
    }
}
//Input: nums = [2,7,11,15], target = 9
// ler array
// salvar em um hasmap o indice e quanto falta para o target
// se existir quanto falta para o target retorno a chave do hashmap e o indice atual