class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        if(s.length()==0)return 0;
        int left=0;
        int right=0;
        int maxLength=0;
        while(right<s.length())
        {
            char currentChar = s.charAt(right);
            if(!set.contains(currentChar))
            {
                set.add(currentChar);
                right++;
                int tempLength = right-left;
                if(tempLength>maxLength)
                {
                    maxLength = tempLength;
                } 
            }
            else
            {
                set.remove(s.charAt(left));
                left++;    
            }
        }
        return maxLength;
    }
}
