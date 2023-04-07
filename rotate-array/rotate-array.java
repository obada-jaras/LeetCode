class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    
    private void reverse(int[] arr, int lo, int hi) {
        while (lo < hi) {
            swap(arr, lo, hi);
            lo++;
            hi--;
        }
    }
    
    private void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}