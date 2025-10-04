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

    int total = m+n;
    int m1=-1,m2=-1;
    int i=0,j=0;
    for(int count=0;count<=total/2;count++)
    {
        m1=m2;
        if(i!=m && (j==n || nums1[i]<= nums2[j]))
        {
            m2=nums1[i++];
        }
        else
        {
            m2 = nums2[j++];
        }
    }
    if(total%2==1)
    {
        return m2;
    }
    else
    {
        return (m1+m2)/2.0;
    }
    }
}