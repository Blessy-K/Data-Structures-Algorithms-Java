class Solution {
    public int[] twoSum(int[] nums, int target) {
    //  for(int i=0;i<nums.length;i++)
    //  {
    //     for(int j=i+1;j<nums.length;j++)
    //     {
    //         if(nums[i]+nums[j]==target)
    //         {
    //             return new int[]{i,j};
    //         }
    //     }
    //  }   
    //  return new int[]{};
    // HashMap<Integer,Integer> map = new HashMap<>();
    // for(int i=0;i<nums.length;i++)
    // {
    //     int ans = target-nums[i];
    //     if(map.containsKey(ans))
    //     {
    //         return new int[]{map.get(ans),i};
    //     }
    //     map.put(nums[i],i);
    // }
    // return new int[]{};

    int[][] arr = new int[nums.length][2];
    for(int i=0;i<nums.length;i++)
    {
        arr[i][0]=nums[i];
        arr[i][1]=i;
    }
    Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
    int l=0,r=nums.length-1;
    while(l<r)
    {
        int sum = arr[l][0]+arr[r][0];
        if(sum==target)
        {
            return new int[]{arr[l][1],arr[r][1]};
        }
        else if(sum<target)
        {
            l++;
        }
        else
        {
            r--;
        }
    }
    return new int[]{};
    }
}