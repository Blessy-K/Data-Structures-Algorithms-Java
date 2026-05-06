class Solution {
    List<List<Integer>>res = new ArrayList<>();
    List<Integer>temp = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
       Backtrack(0,nums);
       return res;
    }
    private void Backtrack(int idx,int[] nums)
    {
        res.add(new ArrayList<>(temp));
        for(int i=idx;i<nums.length;i++)
        {
            temp.add(nums[i]);
            Backtrack(i+1,nums);  //recursive
            temp.remove(temp.size()-1); //Backtrack
        }
    }
}