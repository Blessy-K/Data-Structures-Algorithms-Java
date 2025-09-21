class Solution {
    public int romanToInt(String s) {
    int total =0;
    for(int i=0;i<s.length();i++)
    {
        int c = value(s.charAt(i));
        int n = (i+1<s.length())?value(s.charAt(i+1)):0;
        if(c<n)
        {
            total = total - c;
        }
        else
        {
            total = total + c;
        }
    }    
    return total;
    }
    private int value(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
}