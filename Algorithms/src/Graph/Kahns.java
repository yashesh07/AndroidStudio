package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Kahns {

    Kahns(List<List<Integer>> graph){

        int [] inOrderDegree = new int[graph.size()];

        for(List<Integer> list : graph){
            for(int i : list){
                inOrderDegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i<graph.size(); i++){
            if(inOrderDegree[i]==0) queue.add(i);
        }

        while(!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            List<Integer> list = graph.get(vertex);
            for(int i : list){
                inOrderDegree[i]--;
                if(inOrderDegree[i]==0) queue.add(i);
            }
        }

    }

}
