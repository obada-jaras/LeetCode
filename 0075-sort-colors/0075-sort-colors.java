// Counting Sort
// class Solution {
//     public void sortColors(int[] nums) {
//         int count0 = 0, count1 = 0, count2 = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 0) count0++;
//             else if (nums[i] == 1) count1++;
//             else count2++;
//         }

//         int p = 0;
//         for (int i = 0; i < count0; i++) {
//             nums[p] = 0;
//             p++;
//         }
        
//         for (int i = 0; i < count1; i++) {
//             nums[p] = 1;
//             p++;
//         }
        
//         for (int i = 0; i < count2; i++) {
//             nums[p] = 2;
//             p++;
//         }
//     }
// }


// Two Pointers
class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        for (int i = 0; i <= right; i++) {
            if (nums[i] == 0) {
                swap(nums, left, i);
                left++;
            }
            
            else if (nums[i] == 2) {
                swap(nums, i, right);
                right--;
                i--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}