class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    // char[] current = new char[2*n];
    // generateAll(current,0);
    // return result;
    // }
    // private void generateAll(char[] current, int pos)
    // {
    //     if(pos==current.length)
    //     {
    //         if(isValid(current))
    //         {
    //             result.add(new String(current));
    //         }
    //     }
    //         else
    //         {
    //             current[pos]='(';
    //             generateAll(current,pos+1);
    //             current[pos]=')';
    //             generateAll(current,pos+1);
    //         }
    // }
    //     private boolean isValid(char[] current)
    //     {
    //         int balance = 0;
    //         for(char c : current)
    //         {
    //             if(c=='(')
    //             balance++;
    //             else
    //             balance--;
    //             if(balance<0)
    //             return false;
    //         }
    //         return balance==0;


    backtrack(result,"",0,0,n);
    return result;
        }
        private void backtrack(List<String> result, String current, int open, int close, int max)
        {
            if(current.length()==max*2)
            {
                result.add(current);
                return;
            }
            if(open<max)
            backtrack(result,current+"(",open+1,close,max);
            if(close<open)
            backtrack(result,current+")",open,close+1,max);
        }
}