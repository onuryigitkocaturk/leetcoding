import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC012_ValidParantheses {

    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        char[] char_arr = new char[s.length()];
        char_arr = s.toCharArray();

        for (char c : char_arr) {
            if (mapping.containsValue(c)) {
                myStack.push(c);
            } else if (mapping.containsKey(c)) {
                if (myStack.isEmpty() || mapping.get(c) != myStack.pop()) {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
}
