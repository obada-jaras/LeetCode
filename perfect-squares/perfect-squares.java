
class Solution {
    public int numSquares(int n) {
        int root = (int)Math.sqrt(n);
        int[] perfectSquares = new int[root+1];
        for (int i = 0; i <= root; i++) {
            perfectSquares[i] = i * i;
        }

        boolean[] visited = new boolean[n+1];


        int level = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);

        while (!queue.isEmpty()) {
            level++;

            int qSize = queue.size();
            while (qSize-- > 0) {
                int num = queue.poll();

                for (int i = 0; i < perfectSquares.length; i++) {
                    int remain = num - perfectSquares[i];

                    if (remain == 0) return level;

                    if (remain > 0 && !visited[remain]) {
                        queue.add(remain);
                        visited[remain] = true;
                    }
                }
            }
        }
        return level;
    }
}