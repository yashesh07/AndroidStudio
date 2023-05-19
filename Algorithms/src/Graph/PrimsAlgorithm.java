package Graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    PrimsAlgorithm(List<List<int []>> graph){
        int [] key = new int[graph.size()];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        int [] parent = new int[graph.size()];
        parent[0] = -1;
        boolean [] mst = new boolean[graph.size()];
        PriorityQueue<int []> pq = new PriorityQueue<>(Comparator.comparing(a -> a[1]));
        pq.offer(new int[]{0, key[0]});

        while(!pq.isEmpty()){
            int [] vertex = pq.poll();
            mst[vertex[0]] = true;
            List<int []> list = graph.get(vertex[0]);
            for(int [] v : list){
                if(!mst[v[0]] && v[1]<key[v[0]]){
                    key[v[0]] = v[1];
                    parent[v[0]] = vertex[0];
                    pq.offer(new int[]{v[0], key[v[0]]});
                }
            }
        }

        for(int i = 0; i<graph.size(); i++){
            System.out.println(parent[i] + "---" + i);
        }
    }
}
