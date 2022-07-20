class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int s=nums[i];
            hs.put(s,hs.getOrDefault(s,0)+1);
        }
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(hs.get(nums[i])==1)
                c+=nums[i];
        }
        
        return c;
    }
}