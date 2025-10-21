class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int n = nums.length;
    // int min=Integer.MAX_VALUE;
    // for(int i=0;i<n;i++)
    // {
    //     int sum =0;
    //     for(int j=i;j<n;j++)
    //     {
    //       sum += nums[j];
    //       if(sum>=target)
    //       {
    //         min = Math.min(min,j-i+1);
    //         break;
    //       }
    //     }
    // }    
    // return (min==Integer.MAX_VALUE)?0:min;

    int prefix[] = new int[n+1];
    int l=0,sum=0,min=Integer.MAX_VALUE;
    for(int r=0;r<n;r++)
    {
        sum += nums[r];
        while(sum>=target)
        {
            min = Math.min(min,r-l+1);
            sum -= nums[l];
            l++;
        }
    }
    return (min==Integer.MAX_VALUE)?0:min;
    }
}