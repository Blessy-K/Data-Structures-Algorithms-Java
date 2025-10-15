class Solution {
    public boolean wordPattern(String pattern, String s) {
    String[] w=s.split(" ");
    if(pattern.length()!=w.length)
    return false;
    for(int i=0;i<pattern.length();i++)
    {
        for(int j=i+1;j<pattern.length();j++)
        {
            if(pattern.charAt(i)==pattern.charAt(j))
            {
                if(!w[i].equals(w[j]))
                return false;
            }
            else
            {
                if(w[i].equals(w[j]))
                return false;
            }
        }
    }
    return true;
    }
}