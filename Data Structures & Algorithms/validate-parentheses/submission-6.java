class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    int len = s.length();
    char ch[] = s.toCharArray();
    if(len%2!=0)return false;
    if(len==0) return true;

    for (int i = 0; i < len; i++) {
        if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
            stack.push(ch[i]);
        } else if (ch[i] == '}' || ch[i] == ']' || ch[i] == ')') {
            if (stack.isEmpty()) return false;
            char top = stack.pop();
            if ((ch[i] == '}' && top != '{') ||
                (ch[i] == ']' && top != '[') ||
                (ch[i] == ')' && top != '(')) {
                return false;
            }
        }
    }

    return stack.isEmpty();
}

}
