//Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
//
//Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
//
//
//
//Example 1:
//
//Input: s = "abciiidef", k = 3
//Output: 3
//Explanation: The substring "iii" contains 3 vowel letters.


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abciiidef";
        int k = 3;
        System.out.println(solution.maxVowels(s, k));
    }
}


