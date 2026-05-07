class Solution {
    public boolean isValid(String s) {
    // Stack<Character> stack = new Stack<>();
    // for(char c : s.toCharArray())
    // {
    //     if(c=='(')
    //     stack.push(')');
    //     else if(c=='{')
    //     stack.push('}');
    //     else if(c=='[')
    //     stack.push(']');
    //     else{
    //     if(stack.isEmpty()||stack.pop()!=c)
    //     {
    //         return false;
    //     }
    // }  
    // }
    // return stack.isEmpty();

    Stack<Character>st = new Stack<>();
    for(char ch: s.toCharArray())
    {
        if(ch=='('||ch=='['||ch=='{')
          st.push(ch);
        else{
            if(st.isEmpty()) return false;
            else
            {
                char top = st.pop();
                if(ch == ')' && top != '(') return false;
                if(ch == ']' && top != '[') return false;
                if(ch == '}' && top != '{') return false;
            }
        }
    }
        return st.isEmpty();    
    }
}