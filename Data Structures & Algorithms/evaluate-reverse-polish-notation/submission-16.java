class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int len = tokens.length;
        for(int i=0;i<len;i++)
        {
            if(tokens[i].length()==1)
            {
                char c = tokens[i].charAt(0);
                if(c=='+')
                {
                    int b = s.pop();
                    int a = s.pop();
                    int result = a+b;
                    s.push(result);
                }
                else if(c=='-')
                {
                    int b = s.pop();
                    int a = s.pop();
                    int result = a-b;
                    s.push(result);
                }
                else if(c=='*')
                {
                    int b = s.pop();
                    int a = s.pop();
                    int result = a*b;
                    s.push(result);
                }
                else if(c=='/')
                {
                    int b = s.pop();
                    int a = s.pop();
                    int result = a/b;
                    s.push(result);
                }
                else
                {
                    int val = Integer.parseInt(tokens[i]);
                    s.push(val);
                }
            }
            else
            {
                int val = Integer.parseInt(tokens[i]);
                System.out.println("Val:"+val);
                s.push(val);
            }
            
            
        }
        return s.pop();
    }
}
