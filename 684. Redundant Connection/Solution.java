class Solution {
    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;
        int[] parent = new int[n+1];
        int[] rank = new int[n+1];
        int[] outArray = new int[2];

        for(int i=1; i<=n; i++){
            parent[i] = i;
            rank[i] = 1;
        }

        for(int[] edge : edges){
            if(!union(edge[0], edge[1], parent, rank)){
                outArray[0] = edge[0];
                outArray[1] = edge[1];
            }
        }  
        return outArray;      
        
    } 

    public int find(int x, int[] parent){
            if(parent[x] != x){
                return find(parent[x], parent);
            }
            return parent[x];
        }

    public boolean union(int x, int y, int[] parent, int[] rank){
        int rootX = find(x, parent);
           int rootY = find(y, parent);

        if (rootX == rootY){
            return false; // cycle exists
        }

        if(rank[rootX] < rank[rootY]){
            parent[rootY] = rootX;
        }
        else if(rank[rootX] > rank[rootY]){
            parent[rootX] = rootY;
        }
        else{
            parent[rootY] = rootX;
            rank[rootX]++;
        }

        return true;

    }
}
