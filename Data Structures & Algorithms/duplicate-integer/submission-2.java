class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(st.contains(nums[i])) return true;
            else{
                st.add(nums[i]);
            }
        }
        return false;
    }
}