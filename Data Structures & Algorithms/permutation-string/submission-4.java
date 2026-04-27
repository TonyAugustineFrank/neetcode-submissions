class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] set1 = new int[26];
        int[] set2 = new int[26];
        for(char c: s1.toCharArray())
        {
            set1[c-'a']++;
        }
        int l=0,r;
        int k = s1.length();
        if(s2.length()<k) return false;
        for(r=0;r<k;r++)
        {
            set2[s2.charAt(r)-'a']++;
        }
        if(Arrays.equals(set1,set2))
        {
            return true;
        }
        while(r<s2.length())
        {
            set2[s2.charAt(r)-'a']++;
            set2[s2.charAt(r-k)-'a']--;
            System.out.println((r-k)+" "+r);
            if(Arrays.equals(set1,set2))
            {
                return true;
            }
            r++;
        }
        return false;
    }
}
