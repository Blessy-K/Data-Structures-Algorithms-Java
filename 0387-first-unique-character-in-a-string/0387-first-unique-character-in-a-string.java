class Solution {
    public int firstUniqChar(String s) {
     Map<Character,Integer>freq=new HashMap<>();
     for(char ch:s.toCharArray())
     {
        freq.put(ch,freq.getOrDefault(ch,0)+1);
     }
     for(int i=0;i<s.length();i++)
     {
        char ch = s.charAt(i);
        if(freq.get(ch)==1)
        return i;
     }
     return -1;
    // for(int i=0;i<s.length();i++)
    // {
    //     int count=0;
    //     char ch = s.charAt(i);
    //     for(int j=0;j<s.length();j++)
    //     {
    //         if(s.charAt(j)==ch)
    //         count++;
    //     }
    //     if(count==1)
    //     return i;
    // }
    // return -1;
    }
}