class Solution {
    public double findMaxAverage(int[] nums, int k) {
    //   double max_avg = 0;
    //   for (int i = 0; i < k; ++i)
    //         max_avg += nums[i];
    //     max_avg /= k;
 
    //     for (int i = 0; i <= nums.length - k; ++i) {
    //         double avg = 0;
    //         for (int j = i; j < i + k; ++j)
    //             avg += nums[j];
    //         avg /= k;
    //         max_avg = Math.max(max_avg, avg); 
    //     }
    //     return max_avg;  

    int n = nums.length;
        double curSum = 0;
 
        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }
 
        double maxAvg = curSum / k;
 
        for (int i = k; i < n; i++) {
            curSum += nums[i];
            curSum -= nums[i - k];
 
            double avg = curSum / k;
            maxAvg = Math.max(maxAvg, avg);
        }
 
        return maxAvg;
    }
}