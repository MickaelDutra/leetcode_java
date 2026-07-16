import java.util.*;
// solucao encontrada com tempo e espaco de execucao O(n+m)
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        for (int item : set1) {
            if (!set2.contains(item)) {
                answer.getFirst().add(item);
            }
        }
        for (int item : set2) {
            if (!set1.contains(item)) {
                answer.get(1).add(item);
            }
        }

        return answer;
    }
}


