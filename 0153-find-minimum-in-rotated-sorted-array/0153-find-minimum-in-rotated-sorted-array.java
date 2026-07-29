class Solution {
    public int findMin(int[] nums) {
    // int min = nums[0];
    // for(int num:nums)
    // {
    //     min = Math.min(min,num);
    // }    
    // return min;


    int l=0;
    int h = nums.length-1;
    int ans = Integer.MAX_VALUE;
    while(l<=h)
    {
        if(nums[l]<=nums[h])
        {
            ans = Math.min(ans,nums[l]);
            break;
        }
        int mid = l+(h-l)/2;
        if(nums[l]<=nums[mid])
        {
            ans=Math.min(ans,nums[l]);
            l=mid+1;
        }
        else
        {
            ans = Math.min(ans,nums[mid]);
            h=mid-1;
        }
    }
    return ans;
    }
}