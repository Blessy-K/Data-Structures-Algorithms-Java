class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    int n = grid.length;
    int t=n*n;
    List<Integer> s = new ArrayList<>();
    int r =-1;
    int m =-1;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            int num = grid[i][j];
            if(s.contains(num))
            {
                r=num;
            }
            else
            {
                s.add(num);
            }
        }
    }   
    for(int i=1;i<=t;i++)
    {
        if(!s.contains(i))
        {
            m=i;
            break;
        }
    }
    return new int[]{r,m};
    }
}