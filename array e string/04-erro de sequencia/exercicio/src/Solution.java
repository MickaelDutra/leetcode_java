import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// possui a opcao de xor para resolucao e talvez seja a mais indicada. Mas ainda acho essa mais simples
// e ainda eficiente o suficiente
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 2) {
                result[0] = entry.getKey();
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!count.containsKey(i)) {
                result[1] = i;
            }
        }
        System.out.printf(Arrays.toString(result));
        return result;
    }
}