class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs)
        {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for(String key : map.keySet())
        {
            result.add(map.get(key));
        }
        return result;
    }
}
