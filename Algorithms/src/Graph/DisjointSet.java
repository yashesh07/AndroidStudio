package Graph;

import java.util.Arrays;

public class DisjointSet {

    private final int [] rank;
    private final int [] parent;

    DisjointSet(int size){
        rank = new int[size];
        parent = new int[size];
        for(int i = 0; i<size; i++){
            parent[i] = i;
        }
    }

    public void joinComponent(int u, int v){
        union(u, v);
    }

    public boolean inSameComponent(int u, int v){
        return findParent(u)==findParent(v);
    }

    private void union(int u, int v){
        u = findParent(u);
        v = findParent(v);
        if(rank[u]>rank[v]){
            parent[v] = u;
        }
        else if(rank[v]>rank[u]){
            parent[u] = v;
        }
        else{
            parent[v] = u;
            rank[u]++;
        }
    }

    private int findParent(int n){
        if(parent[n]==n)    return n;
        return parent[n] = findParent(parent[n]);
    }

    public int [] getParents(){
        return parent;
    }
}
