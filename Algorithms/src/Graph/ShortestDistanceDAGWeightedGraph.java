package Graph;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ShortestDistanceDAGWeightedGraph {

    ShortestDistanceDAGWeightedGraph(List<List<int []>> graph, int source){

        int [] distance = new int[graph.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        boolean [] visited = new boolean[graph.size()];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<graph.size(); i++){
            if(visited[i])  continue;
            dfs(graph, visited, stack, i);
        }

        while(!stack.isEmpty()){
            int vertex = stack.pop();
            List<int []> list = graph.get(vertex);
            if(distance[vertex]!=Integer.MAX_VALUE){
                for(int [] arr : list){
                    distance[arr[0]] = Math.min(distance[arr[0]], distance[vertex] + arr[1]);
                }
            }
        }

        System.out.println(Arrays.toString(distance));
    }

    public void dfs(List<List<int []>> graph, boolean [] visited, Stack<Integer> stack, int vertex){
        visited[vertex] = true;
        List<int []> list = graph.get(vertex);
        for(int [] arr : list){
            if(visited[arr[0]]) continue;
            visited[arr[0]] = true;
            dfs(graph, visited, stack, arr[0]);
        }
        stack.push(vertex);
    }
}
