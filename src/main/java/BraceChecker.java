import java.util.Stack;

public class BraceChecker {
    public boolean isValid(String input) {
        if(input.length() % 2 == 1)
            return false;

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == '(')
            {
                stack.push(')');
            }
            else if(input.charAt(i) == '{')
            {
                stack.push('}');
            }
            else if(input.charAt(i) == '[')
            {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != input.charAt(i))
                return false;
        }
        return stack.isEmpty();
    }
}
