class Solution {
    List<List<Integer>> r = new ArrayList<>();
    void generate(int[] nums,List<Integer> current)
    {
        if(current.size()==nums.length)
        {
            Set<Integer> set = new HashSet<>(current);
            if(set.size()==nums.length)
            r.add(new ArrayList<>(current));
            return;
        }
        for(int num: nums)
        {
            current.add(num);
            generate(nums,current);
            current.remove(current.size()-1);
        }
    } 
    public List<List<Integer>> permute(int[] nums) {   
        r.clear();
        generate(nums,new ArrayList<>());
        return r;
    }
}