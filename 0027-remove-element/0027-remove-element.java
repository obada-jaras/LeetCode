class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                swap(nums, count, i);
                count++;
            }
        }
        
        return count;
    }
    
    private void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}