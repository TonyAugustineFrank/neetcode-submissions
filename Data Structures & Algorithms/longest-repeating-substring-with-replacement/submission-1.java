class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right;
        int length= s.length();
        int[] set = new int[26];
        int mostFreq=0;
        int maxLength=0;
        for(right = 0;right< length;right++){
            char c = s.charAt(right);
            set[c-'A']++;
            mostFreq = Math.max(mostFreq,set[c-'A']);
            if(right-left+1 - mostFreq > k){
                set[s.charAt(left)-'A']--;
                left++;
            }else{
                maxLength = Math.max(maxLength, right-left+1);
            }
        }
        return maxLength;
    }
}
