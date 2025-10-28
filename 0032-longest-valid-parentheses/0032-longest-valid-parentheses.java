class Solution {
    public int longestValidParentheses(String s) {
    //     int n = s.length();
    //     int maxLen = 0;        
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 2; j <= n; j += 2) { // valid length must be even
    //             if (isValid(s.substring(i, j))) {
    //                 maxLen = Math.max(maxLen, j - i);
    //             }
    //         }
    //     }
    //     return maxLen;
    // }
    // private boolean isValid(String str) {
    //     int balance = 0;
    //     for (char c : str.toCharArray()) {
    //         if (c == '(') balance++;
    //         else balance--;
    //         if (balance < 0) return false;
    //     }
    //     return balance == 0;


        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}