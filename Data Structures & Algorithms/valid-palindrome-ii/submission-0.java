class Solution {
    private boolean isSubstringValidPalindrome(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return isSubstringValidPalindrome(s,i,j-1) || isSubstringValidPalindrome(s,i+1,j); 
            }
        }
        return true;
    }
}