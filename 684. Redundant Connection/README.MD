684. Redundant Connection
Problem Statement
In this problem, a tree is defined as an undirected graph that is connected and has no cycles.

You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added. This extra edge creates a cycle in the graph.

The given graph is represented as an array edges of length n, where edges[i] = [aᵢ, bᵢ] indicates an edge between nodes aᵢ and bᵢ.

Your task is to find and remove an edge so that the remaining graph is a tree (i.e., no cycles).

If there are multiple possible answers, return the last edge that appears in the input.
Examples
Example 1
Input:
edges = [[1,2],[1,3],[2,3]]
Output:
[2,3]

Example 2
Input:
edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
Output:
[1,4]

Constraints
n == edges.length
3 <= n <= 1000
edges[i].length == 2
1 <= aᵢ < bᵢ <= edges.length
aᵢ ≠ bᵢ (no self-loops)
No repeated edges
The graph is always connected

Solution Approach
We solve this problem using the Union-Find (Disjoint Set Union - DSU) data structure. The main idea is:

Initialize a parent array where each node is its own parent initially.
Use the Find-Union algorithm to check for cycles while iterating through the edges:
If two nodes belong to the same connected component, adding the edge creates a cycle.
If they are in different components, we perform a union operation to merge them.
Return the last edge that forms a cycle in the input.

Complexity Analysis
Processing N edges	O(N α(N)) ≈ O(N)	O(N)
Time Complexity: O(N) (near constant time due to path compression and union by rank).
Space Complexity: O(N) (for the parent and rank arrays).
