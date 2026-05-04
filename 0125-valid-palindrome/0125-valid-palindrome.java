class Solution {
    public boolean isPalindrome(String s) {
    //  int l=0;
    //  int r=s.length()-1;
    //  while(l<r)
    //  {
    //     while(l<r &&! Character.isLetterOrDigit(s.charAt(l)))
    //     {
    //         l++;
    //     }
    //     while(l<r&&!Character.isLetterOrDigit(s.charAt(r)))
    //     {
    //         r--;
    //     }
    //     if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
    //     {
    //         return false;
    //     }
    //     l++;
    //     r--;
    //  }   
    //  return true;


    StringBuilder str = new StringBuilder();
    for(char ch:s.toCharArray())
    {
        if(Character.isLetterOrDigit(ch))
        {
            str.append(Character.toLowerCase(ch));
        }
    }
    return CP(str.toString());
    }
        private boolean CP(String s)
        {
            int l=0,r=s.length()-1;
            while(l<r)
            {
                if(s.charAt(l)!=s.charAt(r))
                return false;
                l++;
                r--;
            }
            return true;
        }
    }
    