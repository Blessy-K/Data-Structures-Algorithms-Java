class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
    {
        return false;
    }
    char[] arr1 = s.toCharArray();
    char[] arr2 = t.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1,arr2);


    // int count[]=new int[26];
    // for(int i=0;i<s.length();i++)
    // {
    //     count[s.charAt(i)-'a']++;
    //     count[t.charAt(i)-'a']--;
    // } 
    // for(int c : count)
    // {
    //     if(c!=0)
    //         return false;
    // }
    // return true;

    // HashMap<Character ,Integer> map = new HashMap<>();
    // for(char c : s.toCharArray())
    // {
    //     map.put(c,map.getOrDefault(c,0)+1);
    // }
    // for(char c : t.toCharArray())
    // {
    //     if(!map.containsKey(c))
    //     return false;
    //     map.put(c,map.get(c)-1);
    //     if(map.get(c)==0)
    //     map.remove(c);
    // }
    // return map.isEmpty();
    }
}