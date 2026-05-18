class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>,List<String>> mp=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++)
        {
            List<Integer> temp=new ArrayList<>(Collections.nCopies(26,0));
            for(int j=0;j<strs[i].length();j++)
            {
                int index=strs[i].charAt(j)-'a';
                temp.set(index,temp.get(index)+1);
            }
            if(mp.containsKey(temp))
            {
                List<String> putList=mp.get(temp);
                putList.add(strs[i]);
            }
            else{
                List<String> newList=new ArrayList<>();
                newList.add(strs[i]);
                mp.put(temp,newList);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
