import java.util.ArrayDeque;
import java.util.Deque;

public class LC020_RemovingStarsFromaString {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public String removeStars(String s) {
        Deque<Character> myStack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                myStack.pop();
            } else {
                myStack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while(!myStack.isEmpty()) {
            result.append(myStack.removeLast());
        }
        return result.toString();
    }
}




