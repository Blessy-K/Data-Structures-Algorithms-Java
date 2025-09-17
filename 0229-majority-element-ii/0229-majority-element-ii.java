class Solution {
    public List<Integer> majorityElement(int[] nums) {
    List<Integer> result = new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    {
        int cnt =0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            cnt++;
        }
        if(cnt>nums.length/3 && !result.contains(nums[i]))
        {
            result.add(nums[i]);
        }
    }   
      return result;
    }
}