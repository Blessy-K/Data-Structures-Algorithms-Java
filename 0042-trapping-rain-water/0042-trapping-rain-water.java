class Solution {
    public int trap(int[] height) {
    // int n = height.length;
    // if(n==0)
    // {
    //     return 0;
    // }
    // int lem[] = new int[n];
    // int rim[] = new int[n];
    // lem[0] = height[0];
    // for(int i=1;i<n;i++)
    // {
    //     lem[i] = Math.max(lem[i-1], height[i]);
    //     rim[n-1] = height[n-1];
    // }
    //     for(int i=n-2;i>=0;i--)
    //     {
    //         rim[i]=Math.max(rim[i+1],height[i]);
    //     }
    //     int total =0;for(int i=0;i<n;i++)
    //     {
    //         total = total+Math.min(lem[i],rim[i])-height[i];
    //     }
    // return total;
       
       int l=0,r=height.length-1;
       int lem =0,rim=0;
       int total =0;
       while(l<r)
       {
        if(height[l]<=height[r])
        {
            if(height[l]>=lem)
            {
                lem=height[l];
            }
            else
            {
                total = total + lem-height[l];
            }
            l++;
        }
        else
        {
            if(height[r]>=rim)
            {
                rim = height[r];
            }
            else
            {
                total += rim-height[r];
            }
            r--;
        }
       }
       return total;
    }
}