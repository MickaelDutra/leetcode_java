import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length -1;

        while (left < right) {

            while (left < right &&
                    !vowels.contains(Character.toLowerCase(chars[left]))) {
                left++;
            }

            while (left < right &&
                    !vowels.contains(Character.toLowerCase(chars[right]))) {
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}