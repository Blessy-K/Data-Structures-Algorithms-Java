class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();
     for(int i=0;i<numRows;i++)
     {
        // List<Integer> row = new ArrayList<>(Collections.nCopies(i+1,1));
        // for(int j=1;j<i;j++)
        // {
        //     row.set(j,triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
        // }
        // triangle.add(row);
        List<Integer> row = new ArrayList<>();
        long num =1;
        for(int j=0;j<=i;j++)
        {
            row.add((int)num);
            num = num * (i-j)/(j+1);
        }
    //     {
    //         if(j==0||j==i)
    //         {
    //         row.add(1);
    //     }
    //     else
    //     {
    //         row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
    //     }
     triangle.add(row);
    }
    return triangle;
    }
}