class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (target == nums[mid]) return mid;
            
            // left part is sorted
            if (nums[left] <= nums[mid]) {
                
                // target in the left part (sorted part)
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                }
                
                // target in the right part (unsorted part)
                else {
                    left = mid + 1;
                }
            }
            
            // right part is sorted
            else {
                
                // target in the right part (sorted part)
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }
                
                // target in the left part (unsorted part)
                else {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }
}