class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    // Set<List<Integer>> set = new HashSet<>();
    // for(int i=0;i<nums.length-2;i++)
    // {
    //     for(int j=i+1;j<nums.length-1;j++)
    //     {
    //       for(int k=j+1;k<nums.length;k++)
    //       {
    //         if(nums[i]+nums[j]+nums[k]==0)
    //         {
    //             List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
    //             Collections.sort(temp);
    //             set.add(temp);
    //         }
    //       }
    //     }
    // }  
    // return new ArrayList<>(set);


    Set<List<Integer>> ans = new HashSet<>();
    for(int i=0;i<nums.length;i++)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int j=i+1;j<nums.length;j++)
        {
            int c = -(nums[i]+nums[j]);
            if(set.contains(c))
            {
                List<Integer> temp = Arrays.asList(nums[i],nums[j],c);
                Collections.sort(temp);
                ans.add(temp);
            }
            set.add(nums[j]);
        }
    }
    return new ArrayList<>(ans);
    }
}