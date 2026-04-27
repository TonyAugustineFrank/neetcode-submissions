class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int[] freq = new int[26];
        int max=0;
        int mostFreq=0;
        for(int right=0;right<s.length();right++)
        {
            freq[s.charAt(right)-'A']++;
            mostFreq = Math.max(freq[s.charAt(right)-'A'],mostFreq);
            if(right-left+1-mostFreq>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }else
            {
                max = Math.max(max,right-left+1);
            }
        }
        return max;
    }
}
