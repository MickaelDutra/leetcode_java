import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> know = new HashMap<>();
        int left = 0;
        int maxValue = 0;
        for (int right = 0; right < s.length(); right++) {
           char caracter = s.charAt(right);

           if (know.containsKey(caracter)){
               left = Math.max(left, know.get(caracter) + 1);
           }

           know.put(caracter, right);

           maxValue = Math.max(maxValue, right - left + 1);
        }

        return maxValue;
    }
}

