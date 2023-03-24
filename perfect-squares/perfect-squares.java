
class Solution {
    public int numSquares(int n) {
        List<Integer> perfectSquares = generatePerfectSquares(n);
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(n);
        visited.add(n);
        
        int level = 0;

        while (!queue.isEmpty()) {
            level++;
            int qSize = queue.size();
            
            for (int i = 0; i < qSize; i++) {
                int currentValue = queue.poll();

                for (int perfectSquare : perfectSquares) {
                    int remaining = currentValue - perfectSquare;

                    if (remaining == 0) {
                        return level;
                    }

                    if (remaining > 0 && !visited.contains(remaining)) {
                        queue.add(remaining);
                        visited.add(remaining);
                    }
                }
            }
        }
        return level;
    }

    private List<Integer> generatePerfectSquares(int n) {
        List<Integer> perfectSquares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            perfectSquares.add(i * i);
        }
        return perfectSquares;
    }
}