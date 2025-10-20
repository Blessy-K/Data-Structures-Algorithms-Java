class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
    char[] current = new char[2*n];
    generateAll(current,0);
    return result;
    }
    private void generateAll(char[] current, int pos)
    {
        if(pos==current.length)
        {
            if(isValid(current))
            {
                result.add(new String(current));
            }
        }
            else
            {
                current[pos]='(';
                generateAll(current,pos+1);
                current[pos]=')';
                generateAll(current,pos+1);
            }
    }
        private boolean isValid(char[] current)
        {
            int balance = 0;
            for(char c : current)
            {
                if(c=='(')
                balance++;
                else
                balance--;
                if(balance<0)
                return false;
            }
            return balance==0;
        }
}