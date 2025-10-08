class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // int n=nums.length;
        // int count =0;
        // for(int i=0;i<n;i++)
        // {
        //     Map<Integer,Integer> freq = new HashMap<>();
        //     int d=0;
        //     for(int j=i;j<n;j++)
        //     {
        //         // Set<Integer> set = new HashSet<>();
        //         freq.put(nums[j],freq.getOrDefault(nums[j],0)+1);
        //         if(freq.get(nums[j])==1)
        //         d++;
        //         if(d==k)
        //         count++;
        //         else if(d>k)

        //         break;
        //         // for(int x=i;x<=j;x++)
        //         // {
        //         //     set.add(nums[x]);
        //         // }
        //         // if(set.size()==k)
        //         // count++;
        //     }
        // }
        return count(nums,k)-count(nums,k-1);
    }
        private static int count(int nums[],int k)
        {
            int n = nums.length;
            int freq[] = new int[n+1];
        int l=0,c=0,d=0;
        // Map<Integer,Integer> freq = new HashMap<>();
        for(int r=0;r<n;r++)
        {
            // freq.put(nums[r],freq.getOrDefault(nums[r],0)+1);
            if(freq[nums[r]]==0)
            d++;
            freq[nums[r]]++;
            while(d>k)
            {
                // freq.put(nums[l],freq.get(nums[l])-1);
                // if(freq.get(nums[l])==0)
                freq[nums[l]]--;
                if(freq[nums[l]]==0)
                d--;
                l++;
            }
            c=c+(r-l+1);
        }
        return c;  
    }
    }