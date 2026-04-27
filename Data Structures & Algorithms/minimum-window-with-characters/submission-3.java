class Solution {
    public String minWindow(String s, String t) {
        // s= s.toLowerCase();
        // t = t.toLowerCase();
        if(t.length()>s.length()){
            return "";
        }
        Map<Character,Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left,right;
        left=0;
        int minLength=1001;
        String result="";
        while(left<s.length()){
            char c=s.charAt(left);
            if(map.containsKey(c)){
                right=left;
                Map<Character,Integer> subMap = new HashMap<>();
                while(right<s.length())
                {
                    char temp = s.charAt(right);
                    if(map.containsKey(temp))
                    {
                        int a = map.get(temp);
                        if(a==subMap.getOrDefault(temp,0))
                        {
                            right++;
                            continue;
                        }
                        subMap.put(temp,subMap.getOrDefault(temp,0)+1);
                        if(map.equals(subMap))
                        {
                            int len = right-left+1;
                            if(len<minLength)
                            {
                                if(right==s.length()-1)
                                {
                                    result = s.substring(left);
                                }
                                else
                                {
                                    result = s.substring(left,right+1);
                                    //ZODYX
                                }
                                minLength=len; // 5
                            }
                            break;
                        }
                    }
                    right++;
                }
            }
            left++;
        } 
        return result;
    }
}
