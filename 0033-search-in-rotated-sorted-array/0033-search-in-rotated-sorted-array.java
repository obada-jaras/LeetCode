class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (target == nums[mid]) return mid;
            
            if (nums[left] <= nums[mid]) { // left part is sorted
                if (target >= nums[left] && target < nums[mid]) { // target in the left part (sorted part)
                    right = mid - 1;
                }
                
                else { // target in the right part (unsorted part)
                    left = mid + 1;
                }
            }
            
            else { // right part is sorted
                if (target > nums[mid] && target <= nums[right]) { // target in the right part (sorted part)
                    left = mid + 1;
                }
                
                else { // target in the left part (unsorted part)
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }
}