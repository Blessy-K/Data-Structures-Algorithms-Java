class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        long l = 1;
        long r=max;
        long ans=max;
        while (l <= r) {
            long mid = (l+r)/2;
            long hr = 0;
            for (int i=0;i<piles.length;i++) 
            {
                hr=hr+((piles[i]+ mid-1)/mid);
            }
            if (hr<=h) {
                ans = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return (int)ans;
    }
}
//     int hr = 0;
//     int max=0;
//     for(int i=0;i<piles.length;i++)
//     {
//         if(piles[i]>max)
//         {
//             max=piles[i];
//         }
//     }
        
//     for(int k=1;k<=max;k++)
//     {
//         hr=0;
//         for(int i=0;i<piles.length;i++)
//         {
//             hr=hr+((piles[i]+k-1)/k);
//         }
//         if(hr<=h)
//         {
//         return (int)k;  
//       }
//     }
//     }
//     return 0;
// }
// }