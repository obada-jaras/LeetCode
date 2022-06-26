// class Solution {
//     public void duplicateZeros(int[] arr) {
        
//         for (int i = 0; i < arr.length-1; i++){
            
//             if (arr[i] == 0) {
//                 for (int j = arr.length-1; j > i+1; j--){
//                     arr[j] = arr[j-1];
//                 }
//                 arr[i+1] = 0;
//                 i++;
//             }
//         }
//     }
// }


class Solution {
    public void duplicateZeros(int[] arr) {
        int[] tempArr = new int[arr.length];
        int tempCounter = 0;
        
        for (int i = 0; tempCounter < arr.length; i++, tempCounter++){
            if (arr[i] == 0){
                tempArr[tempCounter] = 0;
                if (tempCounter == arr.length-1) break;
                tempArr[tempCounter+1] = 0;
                tempCounter++;
            }
            
            else {
                tempArr[tempCounter] = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = tempArr[i];
        }
    }
}