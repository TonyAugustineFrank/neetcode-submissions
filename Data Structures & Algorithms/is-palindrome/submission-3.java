class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1,len = s.length()-1;
        s = s.toLowerCase();

        while(true)
        {
            while(i<len&&!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while(j>0&&!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if(i>j) return true;
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
    }
}
