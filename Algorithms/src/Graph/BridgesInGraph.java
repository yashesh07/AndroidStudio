package Graph;

import java.util.List;

public class BridgesInGraph {

    int [] tin;
    int [] low;
    boolean [] visited;

    BridgesInGraph(List<List<Integer>> graph){
        int size = graph.size();
        tin = new int[size];
        low = new int[size];
        visited = new boolean[size];

        for(int i = 0; i<size; i++){
            if(visited[i])  continue;
            visited[i] = true;
            dfs(graph, i, -1, 0);
        }
    }

    public void dfs(List<List<Integer>> graph, int vertex, int parent, int timer){
        tin[vertex] = timer;
        low[vertex] = timer;
        for(int v : graph.get(vertex)){
            if(v==parent)   continue;
            if(visited[v]){
                low[vertex] = Math.min(low[vertex], tin[v]);
            }
            else{
                visited[v] = true;
                dfs(graph, v, vertex, timer+1);
                low[vertex] = Math.min(low[vertex], low[v]);
                if(low[v]>tin[vertex]){
                    System.out.println(v + "----" + vertex);
                }
            }
        }
    }
}
