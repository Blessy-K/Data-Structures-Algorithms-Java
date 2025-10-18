class Solution {
    public int myAtoi(String s) {
     s=s.trim();
     if(s.length()==0)
     {
        return 0;
     }   
     int sign = 1;
     int i=0;
     if(s.charAt(0)=='-' || s.charAt(0)=='+')
     {
        sign = (s.charAt(0)=='-')?-1:1;
        i++;
     }
     long num =0;
     while(i<s.length() && Character.isDigit(s.charAt(i)))
     {
        num = num*10+(s.charAt(i)-'0');
        if(sign*num<=Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        if(sign*num>=Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        i++;
     }
     return (int)(sign*num);
    }
}