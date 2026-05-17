class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mp=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(mp.contains(nums[i])) return true;
            else{
                mp.add(nums[i]);
            }
        }
        return false;
    }
}