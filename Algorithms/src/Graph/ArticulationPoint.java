package Graph;

import java.util.HashSet;
import java.util.List;

public class ArticulationPoint {

    int [] tin;
    int [] low;
    HashSet<Integer> articulationPoints;
    boolean [] visited;

    ArticulationPoint(List<List<Integer>> graph){
        int size = graph.size();
        tin = new int[size];
        low = new int[size];
        visited = new boolean[size];
        articulationPoints = new HashSet<>();

        for(int i = 0; i<size; i++){
            if(visited[i])  continue;
            visited[i] = true;
            dfs(graph, i, -1, 0);
        }

        for(int v : articulationPoints) System.out.println(v);
    }

    public void dfs(List<List<Integer>> graph, int vertex, int parent, int timer){
        tin[vertex] = timer;
        low[vertex] = timer;
        int child = 0;
        for(int v : graph.get(vertex)){
            if(v==parent)   continue;
            if(visited[v]){
                low[vertex] = Math.min(low[vertex], tin[v]);
            }
            else{
                visited[v] = true;
                dfs(graph, v, vertex, timer+1);
                low[vertex] = Math.min(low[vertex], low[v]);
                if(low[v]>=tin[vertex] && parent!=-1){
                    articulationPoints.add(vertex);
                }
                child++;
            }
        }
        if(parent==-1 && child>1){
            articulationPoints.add(vertex);
        }
    }
}