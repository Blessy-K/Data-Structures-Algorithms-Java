class Solution {
    public String minWindow(String s, String t) {
    //  int min = Integer.MAX_VALUE;
    //  String r = "";
    //  for(int i=0;i<s.length();i++) 
    //  {
    //     for(int j=i+1;j<=s.length();j++)
    //     {
    //         String sub = s.substring(i,j);
    //         if(containsAll(sub,t)&&sub.length()<min)
    //         {
    //             min = sub.length();
    //             r = sub;
    //         }
    //     }
    //  } 
    //  return r; 
    // }
    // static boolean containsAll(String sub, String t)
    // {
    //     int freq[] = new int[128];
    //     for(char c : sub.toCharArray())
    //     {
    //         freq[c]++;
    //     }
    //     for(char c : t.toCharArray())
    //     {
    //         if(--freq[c]<0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    if(s==null || t== null || s.length()<t.length())
    {
        return "";
    }
    int need[] = new int[256];
    for(char ch : t.toCharArray())
    {
        need[ch]++;
    }
    int l =0,r=0,c=t.length();
    int min = Integer.MAX_VALUE;
    int start = 0;
    while(r<s.length())
    {
        char ch = s.charAt(r);
        if(need[ch]>0)
        {
            c--;
        }
            need[ch]--;
            r++;
        while(c==0)
        {
            if(r-l<min)
            {
              min = r-l;
              start = l;
            }
            char lc = s.charAt(l);
            need[lc]++;
            if(need[lc]>0)
            {
                c++;
            }
            l++;
        }
    }
    if(min == Integer.MAX_VALUE)
    {
        return "";
    }
    else
    {
        return s.substring(start,start+min);
    }
    }
}