class Solution {
    public int strStr(String haystack, String needle) {
     int n = haystack.length();
     int m = needle.length();
    //  for(int i=0;i<n-m;i++)
    //  {
    //     int j=0;
    //     while(j<m && haystack.charAt(i+j)==needle.charAt(j))
    //     {
    //         j++;
    //     }
    //     if(j==m)
    //     return i;
    //  }   
    //  return -1;

    // return haystack.indexOf(needle);

    if(needle.isEmpty())
    {
        return 0;
    }
    int l[]=lp(needle);
    int i=0,j=0;
    while(i<n)
    {
        if(haystack.charAt(i)==needle.charAt(j))
        {
            i++;
            j++;
            if(j==m)
            {
                return i-j;
            }
        }
        else
        {
            if(j>0)
            {
                j=l[j-1];
            }
            else
            {
                i++;
            }
        }
    }
    return -1;
    }
    private int[] lp(String pattern)
    {
        int m = pattern.length();
        int l[] = new int[m];
        int len =0;
        int i=1;
        while(i<m)
        {
            if(pattern.charAt(i)==pattern.charAt(len))
            {
                len++;
                l[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                {
                    len=l[len-1];
                }
                else
                {
                    l[i]=0;
                    i++;
                }
            }
        }
        return l;
    }
}