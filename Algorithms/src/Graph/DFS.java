package Graph;
import java.util.List;

public class DFS {

    DFS(List<List<Integer>> graph){
        boolean [] visited = new boolean[graph.size()];
        for(int i = 0; i<graph.size(); i++){
            if(visited[i])  continue;
            System.out.println(i);
            visited[i] = true;
            dfs(graph, visited,i);
        }
    }

    public void dfs(List<List<Integer>> graph, boolean [] visited, int vertex){
        for(int i = 0; i<graph.get(vertex).size(); i++){
            if(visited[graph.get(vertex).get(i)])   continue;
            System.out.println(graph.get(vertex).get(i));
            visited[graph.get(vertex).get(i)] = true;
            dfs(graph, visited, graph.get(vertex).get(i));
        }
    }
}
