package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestDistanceWithUnitWeight {

    ShortestDistanceWithUnitWeight(List<List<Integer>> graph, int source){
        int [] distance = new int[graph.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        boolean [] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        while(!queue.isEmpty()){
            int vertex = queue.poll();
            List<Integer> list = graph.get(vertex);
            for(int i : list){
                if(visited[i])  continue;
                distance[i] = distance[vertex] + 1;
                queue.add(i);
                visited[i] = true;
            }
        }
        System.out.println(Arrays.toString(distance));
    }

}
