class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int s=nums[i];
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==1)
                count+=nums[i];
        }
        
        return count;
    }
}