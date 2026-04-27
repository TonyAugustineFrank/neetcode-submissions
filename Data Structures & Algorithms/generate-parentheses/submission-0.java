class Solution {
    private static List<String> result;
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        backtrack(0,0,n,"");
        return result;
    }
    private void backtrack(int no,int nc,int nt,String c){
        if(no==nt&&nc==nt)
        {
            result.add(c);
            return;
        }
        if(no<nt)
        {
            backtrack(no+1,nc,nt,c+"(");
        }
        if(nc<no)
        {
            backtrack(no,nc+1,nt,c+")");
        }
        return;
    }
}
