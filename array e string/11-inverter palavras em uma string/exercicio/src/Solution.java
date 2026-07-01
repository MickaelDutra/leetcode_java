
import java.util.List;

class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        List<String> words = List.of(s.trim().split("\\s+"));

        for(int i = words.size() - 1; i >= 0; i--){
            result.append(words.get(i));
            if(i > 0){
            result.append(" ");
            }
        }

        return result.toString();
    }
}