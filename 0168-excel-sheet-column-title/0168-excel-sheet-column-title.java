class Solution {
    public String convertToTitle(int columnNumber) {
    StringBuilder result = new StringBuilder();
    while(columnNumber>0)
    {
        columnNumber--;
        int r = columnNumber%26;
        char letter=(char)(r+'A');
        result.append(letter);
        columnNumber=columnNumber/26;
    }    
    return result.reverse().toString();
    }
}