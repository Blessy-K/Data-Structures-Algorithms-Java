class Solution {
    public String longestPalindrome(String s) {
    // int n = s.length();
    // String r = "";
    // for(int i=0;i<n;i++)
    // {
    //     for(int j=i;j<n;j++)
    //     {
    //         String sub = s.substring(i,j+1);
    //         if(isPalindrome(sub)&&sub.length()>r.length())
    //         {
    //             r=sub;
    //         }
    //     }
    // }    
    // return r;
    // }
    // private boolean isPalindrome(String str)
    // {
    //     int l=0,r=str.length()-1;
    //     while(l<r)
    //     {
    //         if(str.charAt(l++) != str.charAt(r--))
    //             return false;
    //     }
    //             return true;

    // if(s==null || s.length()<1)
    // return "";
    // int st=0,end=0;
    // for(int i=0;i<s.length();i++)
    // {
    //     int l1 = expandFrameCenter(s,i,i);
    //     int l2 = expandFrameCenter(s,i,i+1);
    //     int l = Math.max(l1,l2);
    //     if(l>end-st)
    //     {
    //         st=i-(l-1)/2;
    //         end = i+l/2;
    //     }
    // }
    // return s.substring(st,end+1);
    // }
    // private int expandFrameCenter(String s, int left,int right)
    // {
    //     while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
    //     {
    //         left--;
    //         right++;
    //     }
    //     return right-left-1;

    int n = s.length();
    boolean[][] dp = new boolean[n][n];
    String ans = "";
    for(int len=1;len<=n;len++)
    {
        for(int i=0;i+len-1<n;i++)
        {
            int j = i+len-1;
            if(s.charAt(i)==s.charAt(j))
            {
                if(len<=2 || dp[i+1][j-1])
                {
                   dp[i][j]=true;
                   if(len>ans.length())ans = s.substring(i,j+1);
                }
            }
        }
    }
    return ans;
    }
}