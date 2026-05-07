class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
    Stack<Integer>st = new Stack<>();
    int[] res = new int[n];
    for(int r=0;r<n;r++)
    {
        while(!st.isEmpty() && temperatures[st.peek()]<temperatures[r])
        {
            int l = st.pop();
            res[l] = r-l;
        }
        st.push(r);
    }
    return res;
    }
}