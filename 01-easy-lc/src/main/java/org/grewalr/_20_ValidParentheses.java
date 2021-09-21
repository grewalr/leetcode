package org.grewalr;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20_ValidParentheses {

    // 1) If next char is opening brace push onto the stack
    // 2) If next char is a closing brace then lookup opening brace in map
    // 3) If the opening brace on the map matches the top of stack
    // 4) Pop from stack
    // 5) else false i.e. not valid
    private static final Map<Character, Character> braceMap = new HashMap<>();

    static {
        braceMap.put('}', '{');
        braceMap.put(']', '[');
        braceMap.put(')', '(');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] parenthesesArr = s.toCharArray();

        for (char c : parenthesesArr) {
            if (braceMap.containsKey(c)) {
                // Lookup opening brace as this should be
                // on the top of the stack. If stack is
                // empty or opening not on top of stack
                // return false
                char corrOpeningBrace = braceMap.get(c);
                if (stack.isEmpty() || stack.peek() != corrOpeningBrace) return false;
                else stack.pop();
            } else if (braceMap.containsValue(c)) {
                // Push opening brace on to stack
                stack.push(c);
            }
        }

        if (!stack.isEmpty()) return false;
        else return true;
    }

    public boolean isValid_solution(String s) {
        HashMap<Character, Character> maps = new HashMap<Character, Character>();
        maps.put(')', '(');
        maps.put(']', '[');
        maps.put('}', '{');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (maps.containsKey(c)) {
                if (stack.empty() || stack.pop() != maps.get(c)) return false;
            } else
                stack.push(c);
        }

        return stack.empty();
    }


    public static void main(String[] args) {
        _20_ValidParentheses vp = new _20_ValidParentheses();

        String str1 = "()";
        System.out.println(vp.isValid(str1));

        String str2 = "()[]{}";
        System.out.println(vp.isValid(str2));

        String str3 = "(]";
        System.out.println(vp.isValid(str3));

        String str4 = "([)]";
        System.out.println(vp.isValid(str4));

        String str5 = "{[]}";
        System.out.println(vp.isValid(str5));

        String str6 = "[";
        System.out.println(vp.isValid(str6));

        String str7 = "]";
        System.out.println(vp.isValid(str7));

        String str8 = "((";
        System.out.println(vp.isValid(str8));

        String str9 = "]]";
        System.out.println(vp.isValid(str9));

        String str10 = "(({[]}))";
        System.out.println(vp.isValid(str10));
    }
}
