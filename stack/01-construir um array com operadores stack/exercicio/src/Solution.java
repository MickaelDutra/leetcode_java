import java.util.*;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (count < target.length) {
                result.add("Push");
                if (i == target[count]) {
                    count++;
                } else {
                    result.add("Pop");
                }
            }
        }
        System.out.println(result);
        return result;
    }
}