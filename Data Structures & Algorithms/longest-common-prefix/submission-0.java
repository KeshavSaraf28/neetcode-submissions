class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<strs.length;j++)
            {
                if(strs[j].length()<=i || (s.charAt(i)!=strs[j].charAt(i))) return ans;
            }
            ans+=s.charAt(i);
        }
        return ans;
    }
}