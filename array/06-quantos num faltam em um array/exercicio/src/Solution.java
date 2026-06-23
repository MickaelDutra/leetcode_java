import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new java.util.ArrayList<>(List.of());
        int [] arraySorted = Arrays.stream(nums).sorted().toArray();
        System.out.println("array sorted: " + Arrays.toString(arraySorted));

        for (int i = 0; i < arraySorted.length; i++){
            int validation = arraySorted.length != arraySorted[i] ? arraySorted[i + 1] : arraySorted[i];
            if (i == validation){
                result.add(arraySorted[i+1]);
            }
        }
        System.out.println("array result: " + result);
        return null;
    }
}