class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        int[] need = new int[58];
        int match = 0;
        for (char c : t.toCharArray()) {
            need[c - 'A']++;
            if(need[c-'A']==1)
            {
                match++;
            }
        }
        int left, right;
        left=0;
        right=0;
        int have[] = new int[58];
        String result="";
        int res[]= new int[2];
        int minLength=100000;
        while(right <s.length())
        {
            char sChar = s.charAt(right);
            have[sChar-'A']++;
            if(need[sChar-'A']!=0)
            {
                if(have[sChar-'A']==need[sChar-'A'])
                {
                    match--;
                }
            }
            while(match==0)
            {
                int len = right-left+1;
                if(len<minLength)
                {
                    minLength=len;
                    res[0]=left;
                    res[1]=right+1;
                }
                char temp = s.charAt(left);
                have[temp-'A']--;
                left++;
                if(need[temp-'A']!=0)
                {
                    if(have[temp-'A']==(need[temp-'A']-1))
                    {
                        match++;
                    }
                }
            }
            right++; 
        }
        result = s.substring(res[0],res[1]);
        return result;
    }
}