import java.util.*;

class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int maxVowel = 0;
        int left = 0;
        int currentVowel = 0;

        for (int right = 0; right < s.length(); right++) {
            char characterRight = s.charAt(right);
            char characterLeft = s.charAt(left);

            if (isVowel(characterRight)) {
                currentVowel++;
                maxVowel = Math.max(maxVowel, currentVowel);
            }

            if (right - left + 1 == k) {
                if (isVowel(characterLeft)) {
                    currentVowel--;
                }
                left++;
            }
        }

        return maxVowel;
    }

}


