class Solution {
    public int mySqrt(int x) {
       if(x==0)
       {
        return 0;
       }
       long r=x;
       while(r*r>x)
       {
        r=(r+x/r)/2;
       }
       return (int) r;
    // if(x<2)
    // {
    //     return x;
    // }    
    // int l = 1,r = x/2, ans = 0;
    // while(l<=r)
    // {
    //     int mid = l+(r-l)/2;
    //     if((long)mid*mid<=x)
    //     {
    //         ans = mid;
    //         l=mid+1;
    //     }
    //     else
    //     {
    //         r = mid-1;
    //     }
    // }
    // return ans;
    }
}