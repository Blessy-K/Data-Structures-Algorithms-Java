class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
     Set<String> se = new HashSet<>();
     Set<String> r = new HashSet<>();
     for(int i=0;i+9<s.length();i++)
     {
        String su = s.substring(i,i+10);
        if(!se.add(su))
        {
            r.add(su);
        }
     }   
     return new ArrayList<>(r);
    }
}