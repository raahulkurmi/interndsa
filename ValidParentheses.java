import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Handle closing brackets
            else {
                // If stack is empty, no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                // Check if the top of the stack matches the closing bracket
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        // Test cases
        System.out.println(solution.isValid("()")); // Output: true
        System.out.println(solution.isValid("()[]{}")); // Output: true
        System.out.println(solution.isValid("(]")); // Output: false
        System.out.println(solution.isValid("([)]")); // Output: false
        System.out.println(solution.isValid("{[]}")); // Output: true
    }
}
