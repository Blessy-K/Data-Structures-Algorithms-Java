class Solution {
    public String convert(String s, int numRows) {
    if(numRows == 1 || s.length() <= numRows)
    return s;
    // char[][] matrix = new char[numRows][s.length()];
    // int row = 0,col=0;
    // boolean goingDown = true;
    // for(int i=0;i<s.length();i++)
    // {
    //     matrix[row][col]=s.charAt(i);
    //     if(goingDown)
    //     {
    //         if(row == numRows-1)
    //         {
    //             goingDown = false;
    //             row--;
    //             col++;
    //         }
    //         else
    //         {
    //             row++;
    //         }
    //     }
    //         else
    //         {
    //             if(row==0)
    //             {
    //                 goingDown = true;
    //                 row++;
    //             }
    //             else
    //             {
    //                 row--;
    //                 col++;
    //             }
    //         }
    //     }
    //     StringBuilder r = new StringBuilder();
    //     for(int i=0;i<numRows;i++)
    //     {
    //         for(int j=0;j<s.length();j++)
    //         {
    //             if(matrix[i][j]!=0)
    //             r.append(matrix[i][j]);
    //         }
    //     }
    //     return r.toString();   

    //    StringBuilder[] rows = new StringBuilder[numRows];
    //    for(int i=0;i<numRows;i++)
    //    rows[i]=new StringBuilder();
    //    int currRow = 0;
    //    boolean goingDown = false;
    //    for(char c: s.toCharArray())
    //    {
    //     rows[currRow].append(c);
    //     if(currRow==0 || currRow == numRows-1)goingDown=!goingDown;
    //     currRow+=goingDown?1:-1;
    //    }
       StringBuilder r = new StringBuilder();
    //    for(StringBuilder row : rows)
    //    r.append(row);
    //    return r.toString();

       int cl=2*numRows-2;
       for(int i=0;i<numRows;i++)
       {
        for(int j=i;j<s.length();j+=cl)
        {
            r.append(s.charAt(j));
            int d = j+cl-2*i;
            if(i!=0&&i!=numRows-1&&d<s.length())
            {
                r.append(s.charAt(d));
            }
        }
       }
       return r.toString();
    }
}