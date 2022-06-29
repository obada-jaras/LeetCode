class Solution {
    public int numSquares(int n) {
        if (checkPerfectSquare(n)) return 1;
        
        int root = (int)Math.sqrt(n), level = 0;
        int[] perfectSquares = new int[root+1];
        boolean[] visited = new boolean[n+1];
        
        for (int i = 0; i <= root; i++) {
            perfectSquares[i] = i * i;
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        
        while (!q.isEmpty()) {
            level++;
            
            int qSize = q.size();
            while (qSize-- > 0){
                int num = q.poll();
                
                for (int i = 0; i < perfectSquares.length; i++) {
                    int remain = num - perfectSquares[i];
                    
                    if (remain == 0) return level;
                    
                    if (remain > 0 && !visited[remain]) {
                        q.offer(remain);
                        visited[remain] = true;
                    }
                }
            }
        }
        
        return 0;
    }
    
    static boolean checkPerfectSquare(double number) {   
        double sqrt=Math.sqrt(number);   
        return ((sqrt - Math.floor(sqrt)) == 0);   
    }   
}