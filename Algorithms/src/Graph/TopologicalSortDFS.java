package Graph;

import java.util.List;
import java.util.Stack;

public class TopologicalSortDFS {

    Stack<Integer> stack;

    TopologicalSortDFS(List<List<Integer>> graph){
        boolean [] visited = new boolean[graph.size()];
        stack = new Stack<>();
        for(int i = 0; i<graph.size(); i++){
            if(visited[i])  continue;
            dfs(i, visited, graph);
        }
    }

    public void dfs(int vertex, boolean [] visited, List<List<Integer>> graph){
        visited[vertex] = true;
        List<Integer> list = graph.get(vertex);
        for(Integer i : list){
            if(visited[i])  continue;
            dfs(i, visited, graph);
        }
        stack.push(vertex);
    }

    public void printTopologicalOrder(){
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
