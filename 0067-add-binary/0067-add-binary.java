class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1,j=b.length()-1,carry=0;
        StringBuilder sb = new StringBuilder();
        while(i>=0||j>=0||carry!=0)
        {
            int total = carry;
            if(i>=0)
            {
                total = total+a.charAt(i--)-'0';
            }
            if(j>=0)
            {
                total=total+b.charAt(j--)-'0';
            }
            sb.append(total%2);
        carry=total/2;
        }
        return sb.reverse().toString();
    // int num1 = Integer.parseInt(a,2);
    // int num2 = Integer.parseInt(b,2);
    // int sum = num1+num2;
    // return Integer.toBinaryString(sum);    
    }
}