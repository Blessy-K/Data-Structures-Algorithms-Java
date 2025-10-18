class Solution {
    public int myAtoi(String s) {
    //  s=s.trim();
    //  if(s.length()==0)
    //  {
    //     return 0;
    //  }   
    //  int sign = 1;
    //  int i=0;
    //  if(s.charAt(0)=='-' || s.charAt(0)=='+')
    //  {
    //     sign = (s.charAt(0)=='-')?-1:1;
    //     i++;
    //  }
    //  long num =0;
    //  while(i<s.length() && Character.isDigit(s.charAt(i)))
    //  {
    //     num = num*10+(s.charAt(i)-'0');
    //     if(sign*num<=Integer.MIN_VALUE)
    //     {
    //         return Integer.MIN_VALUE;
    //     }
    //     if(sign*num>=Integer.MAX_VALUE)
    //     {
    //         return Integer.MAX_VALUE;
    //     }
    //     i++;
    //  }
    //  return (int)(sign*num);

    int i=0,n=s.length(),sign=1,num=0;
    while(i<n && s.charAt(i)==' ')
    i++;
    if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-'))
    {
        sign = (s.charAt(i)=='-')?-1:1;
        i++;
    }
    while(i<n && Character.isDigit(s.charAt(i)))
    {
        int digit = s.charAt(i)-'0';
        if(num>(Integer.MAX_VALUE-digit)/10)
        return (sign==1)?Integer.MAX_VALUE : Integer.MIN_VALUE;
        num = num*10+digit;
        i++;
    }
    return num*sign;
    }

}