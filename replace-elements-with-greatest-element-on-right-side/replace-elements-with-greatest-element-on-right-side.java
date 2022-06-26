// ---- O(n^2) ----
// class Solution {
//     public int[] replaceElements(int[] arr) {
		
// 		for (int i = 0; i < arr.length; i++) {
// 			int max = -1;
			
// 			for (int j = i+1; j < arr.length; j++) {
// 				max = (arr[j] > max)? arr[j] : max;
// 			}
			
// 			arr[i] = max;
// 		}
		
// 		return arr;
// 	}
// }





// ---- O(n) ----
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
            
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }
            
            else {
                arr[i] = max;
            }
        }
        
        return arr;
    }
}
