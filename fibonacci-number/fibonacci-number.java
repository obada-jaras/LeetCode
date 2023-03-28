class Solution {
    HashMap<Integer, Integer> cache = new HashMap<>(); 
    
    public int fib(int n) {
        if (n < 2) return n;
        
        int i1, i2;
        if (cache.get(n-2) != null)
            i1 = cache.get(n-2);
        else {
            i1 = fib(n-2);
            cache.put(n-2, i1);
        }
        
        if (cache.get(n-1) != null)
            i2 = cache.get(n-1);
        else {
            i2 = fib(n-1);
            cache.put(n-1, i2);
        }
        
        return i1 + i2; 
    }
}