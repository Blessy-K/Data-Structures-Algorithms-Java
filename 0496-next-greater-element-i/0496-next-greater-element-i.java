class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     Map<Integer,Integer>nge = new HashMap<>();
     Stack<Integer>st = new Stack<>();
     for(int val : nums2)
     {
        while(!st.isEmpty() && st.peek()<val)
        {
            nge.put(st.pop(),val);
        }
        st.push(val);
     }
     while(!st.isEmpty())
     {
        nge.put(st.pop(),-1);
     }
     int n = nums1.length;
     int[] res = new int[n];
     for(int i=0;i<n;i++)
     {
        res[i]=nge.get(nums1[i]);
     }
     return res;
    }
}