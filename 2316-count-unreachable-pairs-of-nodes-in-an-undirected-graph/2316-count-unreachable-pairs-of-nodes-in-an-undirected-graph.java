
class Solution {
    static boolean[] visited;

    public static void main(String[] args) {
        System.out.println(countPairs(7, new int[][] {{0,2}, {0,5}, {2,4}, {1,6}, {5,4}}));
    }

    public static long countPairs(int n, int[][] edges) {
        if (edges.length == 0) return (long) n * (n-1) / 2;

        HashMap<Integer, List<Integer>> hash_graph= new HashMap<>();

        for (int i = 0; i < n; i++) {
            hash_graph.put(i, new LinkedList<>());
        }

        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];


            hash_graph.get(node1).add(node2);
            hash_graph.get(node2).add(node1);
        }

        visited = new boolean[n];
        List<Integer> graphsSizes = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int currentGraphSize = 0;

                Stack<Integer> stack = new Stack<>();
                stack.push(i);

                while (!stack.empty()) {
                    int curr = stack.pop();
                    for (int node : hash_graph.get(curr)) {
                        if (!visited[node]) {
                            visited[node] = true;
                            stack.push(node);
                            currentGraphSize++;
                        }
                    }
                }

                graphsSizes.add(currentGraphSize+1);
            }
        }

        long UnreachablePairsCount = 0;
        int[] temp = new int[graphsSizes.size()];

        temp[0] = graphsSizes.get(0);
        for (int i = 1; i < graphsSizes.size(); i++) {
            temp[i] = temp[i-1] + graphsSizes.get(i);
        }

        for (int i = 0; i < graphsSizes.size() - 1; i++) {
            int t1 = temp[i], t2 = graphsSizes.get(i+1);
            UnreachablePairsCount += (long) t1 * t2;
        }


        return UnreachablePairsCount;
    }
}