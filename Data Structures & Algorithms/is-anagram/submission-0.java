class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toUpperCase();
        t = t.toUpperCase();
        int a[] = new int[26];
        int b[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-65]++;
        }
        for(int i=0;i<t.length();i++)
        {
            b[t.charAt(i)-65]++;
        }
        return compareIntArray(a,b);
    }
    private boolean compareIntArray(int a[],int b[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }
}
