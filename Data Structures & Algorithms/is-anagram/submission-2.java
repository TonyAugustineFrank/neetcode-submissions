class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toUpperCase();
        t = t.toUpperCase();
        int a[] = new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-65]++;
            a[t.charAt(i)-65]--;
        }
        return isZeroIntArray(a);
    }
    private boolean isZeroIntArray(int a[])
    {
        for(int val:a)
        {
            if(val!=0)
                return false;
        }
        return true;
    }
}
