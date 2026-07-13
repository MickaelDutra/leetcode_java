import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char charIndex = s.charAt(i);

            if (charIndex != '*'){
                characterStack.push(charIndex);
            }
            else{
                characterStack.pop();
            }
        }
        while (!characterStack.empty()){
            result.append(characterStack.pop());
        }
        result.reverse();
        return result.toString();
    }
}