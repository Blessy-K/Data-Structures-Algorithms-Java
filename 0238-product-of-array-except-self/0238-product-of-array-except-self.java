class Solution {
    public int[] productExceptSelf(int[] nums) {
     int r[]=new int[nums.length];
     r[0]=1;
     for(int i=1;i<nums.length;i++)
     {
        r[i]=r[i-1]*nums[i-1];
     }   
     int ri=1;
     for(int i=nums.length-1;i>=0;i--)
     {
        r[i]=r[i]*ri;
        ri=ri*nums[i];
     }
     return r;
    }
}