class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        char flag = 'I';
         
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) return false;
            if (arr[i] > arr[i+1] && i > 0) flag = 'D';
            
            if (flag == 'I' && arr[i] > arr[i+1]) return false;
            if (flag == 'D' && arr[i] < arr[i+1]) return false;
        }
        
        if (flag == 'I') return false;
        
        return true;
    }
}