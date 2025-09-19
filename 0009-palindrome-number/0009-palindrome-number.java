class Solution {
    public boolean isPalindrome(int x) {
      if(x<0)
      return false;
        int before = x;
        int after = 0;
        while(x>0)
        {
            int digit = x%10;
            x=x/10;
            after = after*10+digit;
        }
        return before == after;
    }
}  