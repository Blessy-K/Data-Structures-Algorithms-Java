class Solution {
    public String intToRoman(int num) {
    int v[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
    String[] s = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    String r = "";
    for(int i=v.length-1;i>=0;i--)
    {
        while(num>=v[i])
        {
            r = r+s[i];
            num = num-v[i];
        }
    }   
    return r;
    }
}