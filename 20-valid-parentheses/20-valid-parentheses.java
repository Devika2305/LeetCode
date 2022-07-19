class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0 ; i < s.length(); i++) {
        switch (s.charAt(i)) {
            case '(':
                charStack.push('(');
                break;
            case '[':
                charStack.push('[');
                break;
            case '{':
                charStack.push('{');
                break;
            case ')':
                if (charStack.size() == 0 || charStack.pop() != '(')
                    return false;
                break;
             case ']':
                if (charStack.size() == 0 || charStack.pop() != '[')
                    return false;
                break;
             case '}':
                if (charStack.size() == 0 || charStack.pop() != '{')
                    return false;
                break;
        }
    }
	
    if (charStack.size() > 0)
        return false;
    return true;
    }
}