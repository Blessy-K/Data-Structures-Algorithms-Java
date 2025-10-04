class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m = nums1.length,n=nums2.length;
    // int mer[] = new int[m + n];
    // int i=0,j=0,k=0;
    // while(i<m)
    // {
    //   mer[k++]=nums1[i++];
    // }    
    // while(j<n)
    // {
    //     mer[k++]=nums2[j++];
    // }
    // Arrays.sort(mer);
    // int total=m+n;
    // if(total%2==1)
    // {
    //     return mer[total/2];
    // }
    // else
    // {
    //     return (mer[total/2-1]+mer[total/2])/2.0;
    // }

    // int total = m+n;
    // int m1=-1,m2=-1;
    // int i=0,j=0;
    // for(int count=0;count<=total/2;count++)
    // {
    //     m1=m2;
    //     if(i!=m && (j==n || nums1[i]<= nums2[j]))
    //     {
    //         m2=nums1[i++];
    //     }
    //     else
    //     {
    //         m2 = nums2[j++];
    //     }
    // }
    // if(total%2==1)
    // {
    //     return m2;
    // }
    // else
    // {
    //     return (m1+m2)/2.0;
    // }

    if(m>n)
    {
        return findMedianSortedArrays(nums2,nums1);
    }
    int total = m+n;
    int l=0,h=m;
    while(l<=h)
    {
        int c1=(l+h)/2;
        int c2 = (total+1)/2-c1;
        int le1,le2,r1,r2;
        if(c1==0)
        {
            le1=Integer.MIN_VALUE;
        }
        else
        {
            le1 = nums1[c1-1];
        }
        if(c1==m)
        {
            r1=Integer.MAX_VALUE;
        }
        else
        {
            r1 = nums1[c1];
        }
        if(c2==0)
        {
            le2 = Integer.MIN_VALUE;
        }
        else
        {
            le2 = nums2[c2-1];
        }
        if(c2==n)
        {
            r2=Integer.MAX_VALUE;
        }
        else
        {
            r2 = nums2[c2];
        }
        if(le1<=r2 && le2<=r1)
        {
            if(total%2==0)
            {
                int lem = Math.max(le1,le2);
                int rm = Math.min(r1,r2);
                return (lem+rm)/2.0;
            }
            else
            {
                return Math.max(le1,le2);
            }
        }
    else if(le1>r2)
    {
        h=c1-1;
    }
    else
    {
        l=c1+1;
    }
}
    return 0.0;
}
}