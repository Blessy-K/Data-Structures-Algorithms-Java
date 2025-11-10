class Solution {
     static final long MOD = (1L << 61) - 1;
    static final long BASE = 131L;
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
        long[] pow = new long[n + 1];
        long[] hash = new long[n + 1];
        pow[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow[i] = modMul(pow[i - 1], BASE);
            hash[i] = modAdd(modMul(hash[i - 1], BASE), s.charAt(i - 1) - 'a' + 1);
        }

        int lo = 1, hi = n - 1, start = -1, best = 0;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            int idx = dup(s, mid, pow, hash);
            if (idx != -1) {
                start = idx;
                best = mid;
                lo = mid + 1;
            } else hi = mid - 1;
        }
        return start == -1 ? "" : s.substring(start, start + best);
    }

    private int dup(String s, int len, long[] pow, long[] hash) {
        int n = s.length();
        HashSet<Long> seen = new HashSet<>();
        for (int i = 0; i + len <= n; i++) {
            long cur = getHash(hash, pow, i, i + len);
            if (!seen.add(cur)) return i;
        }
        return -1;
    }

    private long getHash(long[] h, long[] p, int l, int r) {
        return modSub(h[r], modMul(h[l], p[r - l]));
    }

    private long modAdd(long a, long b) {
        long res = a + b;
        if (res >= MOD) res -= MOD;
        return res;
    }

    private long modSub(long a, long b) {
        long res = a - b;
        if (res < 0) res += MOD;
        return res;
    }

    private long modMul(long a, long b) {
        long au = a >>> 31, ad = a & ((1L << 31) - 1);
        long bu = b >>> 31, bd = b & ((1L << 31) - 1);
        long mid = ad * bu + au * bd;
        long res = (au * bu * 2 + ad * bd + ((mid & ((1L << 30) - 1)) << 31) + (mid >>> 30)) % MOD;
        if (res >= MOD) res -= MOD;
        return res;
    }
}