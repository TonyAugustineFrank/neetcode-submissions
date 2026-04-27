class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs)
        {
            char[] tmp = str.toCharArray();
            int len = str.length();
            sb.append(len+"%"+str);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>(); 
        
        for(int i=0;i<str.length();i++)
        {
            int j=i;
            while(str.charAt(j)!='%')
            {
                j++;
            }
            System.out.println(str.substring(i,j));
            int size = Integer.parseInt(str.substring(i,j));
            result.add(str.substring(j+1,j+size+1));
            i = j+size;
            
        }


        return result;
    }
}
