import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> notation = new Stack<>();
        int a;
        int b;
        for (String token : tokens) {
            switch (token) {
                case ("+"):
                    b = notation.pop();
                    a = notation.pop();
                    notation.push(a + b);
                    break;

                case ("-"):
                    a = notation.pop();
                    b = notation.pop();
                    notation.push(b - a);
                    break;

                case ("*"):
                    a = notation.pop();
                    b = notation.pop();
                    notation.push(a * b);
                    break;

                case ("/"):
                    a = notation.pop();
                    b = notation.pop();
                    notation.push(b / a);
                    break;

                default:
                    notation.push(Integer.parseInt(token));
                    break;
            }
        }
        return notation.pop();
    }
}