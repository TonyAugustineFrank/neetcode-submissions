class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> s = new Stack<>();
        int[] result = new int[temperatures.length];
        int i=temperatures.length-1;
        while(i>=0)
        {
            if(s.isEmpty())
            {
                result[i]=0;
                s.push(i);
            }
            else
            {
                while(!s.isEmpty()&&temperatures[s.peek()]<=temperatures[i])
                {
                    s.pop();
                }
                if(!s.isEmpty())
                {
                    result[i]=s.peek()-i;
                }
                else{
                    result[i]=0;
                }
                s.push(i);
            }
            i--;
        }
        return result;
    }
}
