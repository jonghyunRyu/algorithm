import java.util.*;

class Solution {
    boolean solution(String s) {
        
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            if (stack.empty()) {
                if (s.charAt(i) == ')') {
                    return false;
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                if (s.charAt(i) == ')') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}