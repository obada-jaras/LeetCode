// ---- O(n^2) ----
class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2) return true;
                if (arr[j] == arr[i] * 2) return true;
            }
        }
      
        return false;
    }
}








// ---- O(n log n) ----
// class Solution {
//     public boolean checkIfExist(int[] arr) {
//         Arrays.sort(arr);
//         int i = 0, j = 1;
//       
//         while (i < arr.length) {
//           
//             if (arr[i] > 0) {
//                 if (arr[j] == arr[i]*2)
//                     return true;
//
//                 else if (arr[j] < arr[i]*2 && j < arr.length-1) 
//                     j++;
//
//                 else 
//                     i++;
//             }
//           
//           
//             else if (arr[i] < 0) {
//                 if (arr[i] == arr[j]*2)
//                     return true;
//
//                 else if (arr[i] > arr[j]*2 && j < arr.length-1) 
//                     j++;
//
//                 else
//                     i++;
//             }
//           
//         
//             else {
//                 if (arr[i] == arr[i+1]*2) return true;
//                 i++;
//             }
//         }
//       
//       
//         return false;
//     }
// }











// ---- O(n log n) ----
// class Solution {
//     public boolean checkIfExist(int[] arr) {
//        
//         TreeSet set = new TreeSet();
//        
//         for (int i: arr) {
//             if (set.contains(i*2)) return true;
//             if (set.contains(i/2) && i%2 == 0) return true;
//             set.add(i);
//         }
//        
//         return false;
//     }
// }














// ---- O(n) ----
// class Solution {
//     public boolean checkIfExist(int[] arr) {
//       
//         HashSet set = new HashSet();
//       
//         for (int i: arr) {
//             if (set.contains(i*2)) return true;
//             if (set.contains(i/2) && i%2 == 0) return true;
//             set.add(i);
//         }
//       
//         return false;
//     }
// }