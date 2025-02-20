// Time Complexity :O(logn)
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[low]<=nums[mid]){
            if(nums[low]<=target && target<nums[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
            }
            if(nums[mid]<=nums[high]){
                if(nums[mid]<target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
