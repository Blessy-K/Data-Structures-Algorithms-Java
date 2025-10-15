class Solution {
    public boolean wordPattern(String pattern, String s) {
    String[] words=s.split(" ");
    if(pattern.length()!=words.length)
    return false;
    // for(int i=0;i<pattern.length();i++)
    // {
    //     for(int j=i+1;j<pattern.length();j++)
    //     {
    //         if(pattern.charAt(i)==pattern.charAt(j))
    //         {
    //             if(!w[i].equals(w[j]))
    //             return false;
    //         }
    //         else
    //         {
    //             if(w[i].equals(w[j]))
    //             return false;
    //         }
    //     }
    // }
    // return true;
    // }

    Map<Character,String> map = new HashMap<>();
    Set<String> used = new HashSet<>();
    for(int i=0;i<pattern.length();i++)
    {
        char ch = pattern.charAt(i);
        String word = words[i];
        if(map.containsKey(ch))
        {
            if(!map.get(ch).equals(word))
            return false;
        }
        else
        {
            if(used.contains(word))
            return false;
            map.put(ch,word);
            used.add(word);
        }
    }
    return true;
}
}