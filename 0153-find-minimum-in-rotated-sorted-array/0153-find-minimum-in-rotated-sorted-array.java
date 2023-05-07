// O(n)
// class Solution {
//     public int findMin(int[] nums) {
//         for (int i = 0; i < nums.length-1; i++) {
//             if (nums[i+1] < nums[i]) return nums[i+1];
//         }
        
//         return nums[0];
//     }
// }


// O(log n)
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
