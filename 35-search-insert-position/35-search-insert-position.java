class Solution {
    public int searchInsert(int[] nums, int target) {
        int r = 0, l = nums.length-1, mid=0;
        
        // binary search algorithm
        while(r<=l){
            mid = (l+r)/2;
            
            if(nums[mid]==target){
                break;
            }
            else if(target>nums[mid]){
                r = mid+1;
            }
            else{
                l = mid-1;
            }
            
        }
        
        if(nums[mid]==target || nums[mid]>target)
            return mid;
        else
            return mid+1;
    }
}