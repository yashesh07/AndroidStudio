package Graph;

import java.util.List;

public class DetectCycleInDirectedGraphUsingDFS {

    boolean hasCycle = false;

    DetectCycleInDirectedGraphUsingDFS(List<List<Integer>> graph){
        boolean [] visited = new boolean[graph.size()];
        boolean [] dfsVisited = new boolean[graph.size()];
        for(int i = 0; i<graph.size(); i++){
            if(visited[i])  continue;
            hasCycle = dfs(i, visited, dfsVisited, graph);
            if(hasCycle)    break;
        }
    }

    public boolean dfs(int vertex, boolean [] visited, boolean [] dfsVisited, List<List<Integer>> graph){
        List<Integer> list = graph.get(vertex);
        visited[vertex] = true;
        dfsVisited[vertex] = true;
        boolean hasCycle = false;
        for (Integer integer : list) {
            if (dfsVisited[integer]) return true;
            if(visited[integer])    continue;
            hasCycle = dfs(integer, visited, dfsVisited, graph);
            if (hasCycle) break;
        }
        dfsVisited[vertex] = false;
        return hasCycle;
    }

    public boolean detectCycle(){
        return hasCycle;
    }

}
