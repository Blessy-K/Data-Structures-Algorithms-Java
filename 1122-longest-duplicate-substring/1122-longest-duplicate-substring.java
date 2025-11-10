class Solution {
    public String longestDupSubstring(String s) {
    //  int n = s.length();
    //  String res = "";
    //  for(int i=0;i<n;i++)
    //  {
    //     HashSet<String> a = new HashSet<>();
    //     for(int j=0;j+i<=n;j++)
    //     {
    //         String sub = s.substring(j,j+i);
    //         if(!a.add(sub))
    //         {
    //             if(i>res.length())
    //             res=sub;
    //         }
    //     }
    //  }   
    //  return res;




       
        
        int n = s.length();
        int left = 1, right = n - 1;
        int start = -1, maxLen = 0;

        long mod1 = 1000000007L, mod2 = 1000000009L;
        long base = 256; 
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int idx = check(s, mid, base, mod1, mod2);
            if (idx != -1) {
                start = idx;
                maxLen = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return start == -1 ? "" : s.substring(start, start + maxLen);
    }

    private int check(String s, int len, long base, long mod1, long mod2) {
        int n = s.length();
        long h1 = 0, h2 = 0;
        long pow1 = 1, pow2 = 1;
        for (int i = 0; i < len; i++) {
            int v = s.charAt(i) - 'a' + 1;
            h1 = (h1 * base + v) % mod1;
            h2 = (h2 * base + v) % mod2;
            pow1 = (pow1 * base) % mod1;
            pow2 = (pow2 * base) % mod2;
        }

        java.util.HashSet<Long> seen = new java.util.HashSet<>();
        seen.add(pack(h1, h2));
        for (int i = len; i < n; i++) {
            int add = s.charAt(i) - 'a' + 1;
            int remove = s.charAt(i - len) - 'a' + 1;
            h1 = (h1 * base + add - (remove * pow1) % mod1 + mod1) % mod1;
            h2 = (h2 * base + add - (remove * pow2) % mod2 + mod2) % mod2;
            long key = pack(h1, h2);
            if (!seen.add(key)) return i - len + 1;
        }
        return -1;
    }

    private long pack(long a, long b) {
        return (a << 32) | (b & 0xffffffffL);
    }
}