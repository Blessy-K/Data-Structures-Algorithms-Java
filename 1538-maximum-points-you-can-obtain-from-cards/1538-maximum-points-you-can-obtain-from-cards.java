class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
    // int fsum =0;
    // for(int i=0;i<n-k;i++)
    // {
    //     fsum+=cardPoints[i];
    // }    
    // int bsum=0;
    // for(int i=n-1;i>n-k-1;i--)
    // {
    //     bsum=bsum+cardPoints[i];
    // } 
    // return Math.max(fsum,bsum);
    int lsum =0,rsum=0,msum=0;
    for(int i=0;i<k;i++)
    {
        lsum+=cardPoints[i];
    }
        msum=lsum;
        int ri=n-1;
    for(int i=k-1;i>=0;i--)
    {
        lsum-=cardPoints[i];
        rsum+=cardPoints[ri];
        ri--;
        msum=Math.max(msum,rsum+lsum);
    }
    return msum;
    }
}