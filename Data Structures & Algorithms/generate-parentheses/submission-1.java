class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        result =backtrack(0,0,n,"",result);
        return result;
    }
    private List<String> backtrack(int no,int nc,int nt,String c,List<String> result){
        if(no==nt&&nc==nt)
        {
            result.add(c);
            return result;
        }
        if(no<nt)
        {
            result=backtrack(no+1,nc,nt,c+"(",result);
        }
        if(nc<no)
        {
            result=backtrack(no,nc+1,nt,c+")",result);
        }
        return result;
    }
}
