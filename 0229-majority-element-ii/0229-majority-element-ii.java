class Solution {
    public List<Integer> majorityElement(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    {
        // int cnt =0;
        int num = nums[i];
        if(freq.containsKey(num))
        {
            freq.put(num,freq.get(num)+1);
        }
        else
        {
            freq.put(num,1);
        }
    }
    for(Integer key: freq.keySet())
    {
        if(freq.get(key)>nums.length/3)
        {
            result.add(key);
        }
    }
        // for(int j=0;j<nums.length;j++)
        // {
        //     if(nums[i]==nums[j])
        //     cnt++;
        // }
        // if(cnt>nums.length/3 && !result.contains(nums[i]))
        // {
        //     result.add(nums[i]);
      return result;
    }
}