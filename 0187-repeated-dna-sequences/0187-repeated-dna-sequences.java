class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    //  Set<String> se = new HashSet<>();
    //  Set<String> r = new HashSet<>();
    //  for(int i=0;i+9<s.length();i++)
    //  {
    //     String su = s.substring(i,i+10);
    //     if(!se.add(su))
    //     {
    //         r.add(su);
    //     }
    //  }   
    //  return new ArrayList<>(r);



        // Map<String, Integer> freq = new HashMap<>();
        // List<String> res = new ArrayList<>();

        // for (int i = 0; i + 9 < s.length(); i++) {
        //     String sub = s.substring(i, i + 10);
        //     freq.put(sub, freq.getOrDefault(sub, 0) + 1);
        //     if (freq.get(sub) == 2) res.add(sub);
        // }
        // return res;



        int n = s.length();
        if (n < 10) return new ArrayList<>();

        Map<Character, Integer> map = Map.of(
            'A', 0, 'C', 1, 'G', 2, 'T', 3);

        Set<Integer> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int hash = 0;

        for (int i = 0; i < n; i++) {
            hash = ((hash << 2) | map.get(s.charAt(i))) & ((1 << 20) - 1);

            if (i >= 9) {
                if (!seen.add(hash)) {
                    repeated.add(s.substring(i - 9, i + 1));
                }
            }
        }
        return new ArrayList<>(repeated);
    }
}