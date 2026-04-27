class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())return false;
        int sh1[] = new int [26];
        int sh2[] = new int [26];
        int diff=0;
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            if(sh1[c-'a']==0)diff++;
            sh1[c-'a']++;
        }
        int r;
        for(r=0;r<s1.length();r++)
        {
            char c = s2.charAt(r);
            sh2[c-'a']++;
            if(sh2[c-'a']==sh1[c-'a'])
                diff--;
            else if(sh2[c-'a']==(sh1[c-'a']+1))
                diff++;
        }
        if(diff==0)
        {
            return true;
        }
        int l=0;
        while(r<s2.length())
        {
            char c1= s2.charAt(r);
            char c2= s2.charAt(l);
            sh2[c1-'a']++;
            
            if(sh2[c1-'a']==sh1[c1-'a'])
            {
                diff--;
            }
            else if(sh2[c1-'a']==(sh1[c1-'a']+1))
            {
                diff++;
            }
            sh2[c2-'a']--;
            if(sh2[c2-'a']==sh1[c2-'a'])
            {
                diff--;
            }
            else if(sh2[c2-'a']==(sh1[c2-'a']-1))
            {
                diff++;
            }
            if(diff==0)
                return true;
            r++;
            l++;
        }
        return false;
    }
}
