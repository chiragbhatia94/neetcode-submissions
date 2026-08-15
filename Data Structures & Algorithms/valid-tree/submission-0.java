class Solution {
    public boolean validTree(int n, int[][] edges) {
        Map<Integer, List<Integer>> adjacencyMetrics = new HashMap<>();
        boolean[] visited = new boolean[n];

        for (int i =0; i < n; i++) {
            adjacencyMetrics.put(i, new ArrayList<>());
        }

        for (int[] edge: edges) {
            adjacencyMetrics.get(edge[0]).add(edge[1]);
            adjacencyMetrics.get(edge[1]).add(edge[0]);
        }

        // this checking if there is any cycle
        if (hasCycle(0, visited, adjacencyMetrics, -1)) return false;

        // this is checking it there are any disconnected nodes
        for (boolean v: visited) {
            if (!v) return false;
        }

        return true;
    }

    boolean hasCycle(int node, boolean[] visited, Map<Integer, 
                        List<Integer>> adjacencyMetrics, int parent) {
        visited[node] = true;
        for (int neighbor: adjacencyMetrics.get(node)) {
            if (visited[neighbor] && parent != neighbor) {
                return true;
            } else if (!visited[neighbor] && hasCycle(neighbor, 
            visited, adjacencyMetrics, node)) {
                return true;
            }
        }
        return false;
    }
}
