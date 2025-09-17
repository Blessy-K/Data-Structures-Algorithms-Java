class Solution {
    public List<Integer> majorityElement(int[] nums) {
    // Map<Integer, Integer> freq = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    int e1=0,e2=0;
    int c1=0,c2=0;
    for(int i=0;i<nums.length;i++)
    {
        int num = nums[i];
        if(num == e1)
        {
            c1++;
        }
        else if(num==e2)
        {
            c2++;
        }
        else if(c1==0)
        {
            e1=num;
            c1=1;
        }
        else if(c2==0)
        {
            e2=num;
            c2=1;
        }
        else
        {
            c1--;
            c2--;
        }
    }
    c1=0;
    c2=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==e1)
        {
            c1++;
        }
        else if(nums[i]==e2)
        {
            c2++;
        }
    }
        if(c1>nums.length/3)
        {
            result.add(e1);
        }
        if(c2>nums.length/3)
        {
            result.add(e2);
        }
    //     // int cnt =0;
    //     int num = nums[i];
    //     if(freq.containsKey(num))
    //     {
    //         freq.put(num,freq.get(num)+1);
    //     }
    //     else
    //     {
    //         freq.put(num,1);
    //     }
    // }
    // for(Integer key: freq.keySet())
    // {
    //     if(freq.get(key)>nums.length/3)
    //     {
    //         result.add(key);
    //     }
    // }
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