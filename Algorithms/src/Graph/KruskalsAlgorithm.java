package Graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class KruskalsAlgorithm {

    DisjointSet disjointSet;

    KruskalsAlgorithm(int [][] edges, int n){
        disjointSet = new DisjointSet(n);
        Arrays.sort(edges, Comparator.comparing(a -> a[0]));
        for(int i = 0; i<edges.length; i++){
            if(disjointSet.inSameComponent(edges[i][1], edges[i][2])) continue;
            System.out.println(edges[i][1] +" "+ edges[i][2]);
            disjointSet.joinComponent(edges[i][1], edges[i][2]);
        }
        int [] parent = disjointSet.getParents();
        for(int i = 0; i<n; i++){
            System.out.println(parent[i] + "---" + i);
        }
    }

}
