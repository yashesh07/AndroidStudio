package Graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    DijkstraAlgorithm(List<List<int []>> graph, int source){
        int [] distance = new int[graph.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        PriorityQueue<int []> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{source, 0});
        while(!pq.isEmpty()){
            int [] vertex = pq.poll();
            List<int []> list = graph.get(vertex[0]);
            for(int [] node : list){
                if(vertex[1]+node[1]<distance[node[0]]){
                    distance[node[0]] =  vertex[1]+node[1];
                    pq.offer(new int[]{node[0], distance[node[0]]});
                }
            }
        }
        System.out.println(Arrays.toString(distance));
    }
}
