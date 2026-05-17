class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(nums[i])) return new int[]{mp.get(nums[i]),i};
            else{
                mp.put(target-nums[i],i);
            }
        }
        return new int[2];
    }
}
