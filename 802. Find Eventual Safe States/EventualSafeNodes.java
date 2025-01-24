class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> safeNodes = new ArrayList<>();
        int[] state = new int[graph.length];

        for(int i=0; i<graph.length; i++){
            if(dfs(graph, i, state)){
                safeNodes.add(i);
            }
        }
        return safeNodes;
    }

    private boolean dfs(int[][] graph, int node, int[] state){
        if(state[node] != 0){
            return state[node] == 1;
        }

        state[node] = 2; 
        for(int neighbor : graph[node]){
            if(!dfs(graph, neighbor, state)){
                return false;
            }
        }

        state[node] = 1;
        return true;
    }

}
