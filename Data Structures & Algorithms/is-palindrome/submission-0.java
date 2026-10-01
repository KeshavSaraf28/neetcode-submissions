class Solution {
    public boolean isPalindrome(String s) {
        int diff='a'-'A';
        int i=0,j=s.length()-1;
        while(i<j)
        {
            char chari=s.charAt(i),charj=s.charAt(j);
            if(!Character.isLetterOrDigit(chari)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(charj))
            {
                j--;
                continue;
            }
            if(Character.toLowerCase(chari)==Character.toLowerCase(charj))
            {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
