class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        char ch[] = s.toCharArray();
        if(len%2!=0)return false;
        if(len==0) return true;

        for (int i = 0; i < len; i++) {
            if (ch[i] == '{') {
                stack.push('}');
            } else if (ch[i] == '[') {
                stack.push(']');
            } else if (ch[i] == '(') {
                stack.push(')');
            } else {
                if (stack.isEmpty() || stack.pop() != ch[i]) return false;
            }
        }

        return stack.isEmpty();
    }
}
