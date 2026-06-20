class Solution {
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
        int l=1,r=(arr[arr.length-1]-arr[0]);
        int ans =0;
        while(l<=r)
        {
          int mid= l+(r-l)/2;

            int ball = 1;
            int curr = arr[0];
        // for(int j=1;j<=arr[arr.length-1]-arr[0];j++)
        // {
        //     int ball = m;
        // int curr = arr[0];
        // ball=ball-1;
        // int min=j;
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]-curr>=mid)
           {
            ball++;
            curr=arr[i];
           }
        } 
        if (ball >= m) {
                ans = mid;
                l = mid+1;
        }  
        else {
                r = mid - 1;
        }
        }
        return ans;
    }
}