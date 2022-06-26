// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         List<Integer> list = new ArrayList<Integer>();
//         int[] newArr = new int[nums.length];
        
//         for (int n: nums) {
//             newArr[n-1] = 1;
//         }
        
//         for (int i = 0; i < newArr.length; i++) {
//             if (newArr[i] == 0)
//                 list.add(i+1);
//         }
        
//         return list;
//     }
// }



    
    

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i])-1] = -1 * Math.abs(nums[Math.abs(nums[i])-1]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) list.add(i+1);
        }
        
        return list;
    }
}
