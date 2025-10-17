class Solution {
    public boolean isMatch(String s, String p) {
    // return match(s,p,0,0);    
    // }
    // private boolean match(String s,String p,int i,int j)
    // {
    //     if(j==p.length())
    //     return i == s.length();
    //     boolean firstMatch = (i<s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));
    //     if(j+1<p.length() && p.charAt(j+1) == '*')
    //     {
    //         return match(s,p,i,j+2) || (firstMatch && match(s,p,i+1,j));
    //     }
    //     else
    //     {
    //         return firstMatch && match(s,p,i+1,j+1);
        // }

        int m = s.length(),n=p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[m][n]=true;
        for(int i=m;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                boolean firstMatch = (i<m && (s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'));
                if(j+1<n && p.charAt(j+1)=='*')
                {
                    dp[i][j]=dp[i][j+2]||(firstMatch && dp[i+1][j]);
                }
                else
                {
                    dp[i][j] = firstMatch && dp[i+1][j+1];
                }
            }
        }
       return dp[0][0];
    }
}