class Solution {
    public int maxArea(int[] height) {
    // int maxw=0;
    // for(int i=0;i<height.length;i++)
    // {
    //     for(int j=i;j<height.length;j++)
    //     {
    //         int width=j-i;
    //         int h = Math.min(height[i],height[j]);
    //         int area = width*h;
    //          maxw = Math.max(area,maxw);
    //     }
    // }   
    // return maxw;


    int maxw=0;
    int l=0,r=height.length-1;
    while(l<r)
    {
        int w=r-l;
        int h = Math.min(height[l],height[r]);
        int area = w*h;
        maxw=Math.max(area,maxw);
        if(height[l]<height[r])
        l++;
        else
        r--;
    }
    return maxw;
    }
}