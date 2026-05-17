class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Boolean> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(nums[i])) return true;
            else{
                mp.put(nums[i],true);
            }
        }
        return false;
    }
}