package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    BFS(List<List<Integer>> graph){
        traverse(graph);
    }

    public void traverse(List<List<Integer>> graph){
        Queue<Integer> queue = new LinkedList<>();
        boolean [] visited = new boolean[graph.size()];
        for(int i = 0; i<graph.size(); i++){
            if(visited[i]) continue;
            queue.add(i);
            System.out.println(i);
            visited[i] = true;
            while(!queue.isEmpty()){
                int vertex = queue.poll();
                for(int j = 0; j<graph.get(vertex).size(); j++){
                    if(!visited[graph.get(vertex).get(j)]){
                        queue.add(graph.get(vertex).get(j));
                        System.out.println(graph.get(vertex).get(j));
                        visited[graph.get(vertex).get(j)] = true;
                    }
                }
            }
        }
    }
}
