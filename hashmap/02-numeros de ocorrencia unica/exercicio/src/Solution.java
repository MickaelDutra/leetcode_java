import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public Boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> item = new HashMap<>();

        for(int num : arr){
            item.put(num, item.getOrDefault(num, 0) + 1);
        }
        Set<Integer> values = new HashSet<>(item.values());

        System.out.println("set size: " + values.size());
        System.out.println(values);
        System.out.println("hash size: " + item.size());
        System.out.println(item);

        return values.size() == item.size();
    }
}


