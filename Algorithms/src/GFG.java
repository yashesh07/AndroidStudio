/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    static Scanner scan;
    static int minDis;

    public static void main (String[] args) {
        scan = new Scanner(System.in);
        int T = scan.nextInt();
//        int T = 1;
        while(T-->0) {
            solve();
        }
    }

    public static void solve() {
        int n = scan.nextInt();
        int m = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        int c3 = scan.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<=n; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i<m; i++){
            int u = scan.nextInt();
            int v = scan.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }
        ShortestDistanceWithUnitWeight sd = new ShortestDistanceWithUnitWeight(list, n);
        int [] d = sd.getDistance();
        sd = new ShortestDistanceWithUnitWeight(list, x);
        int [] dx = sd.getDistance();
        sd = new ShortestDistanceWithUnitWeight(list, y);
        int [] dy = sd.getDistance();

        if(d[x]==Integer.MAX_VALUE || d[y]==Integer.MAX_VALUE){
            System.out.println(-1);
            return;
        }

        minDis = d[x]*c1 + d[y]*c2;
        boolean [] visited = new boolean[n+1];
        dfs(n, visited, list, c1, c2, c3, d, dx, dy);
        System.out.println(minDis);
    }

    public static void dfs(int vertex, boolean [] visited, List<List<Integer>> list, int c1, int c2, int c3, int [] d, int [] dx, int [] dy){
        visited[vertex] = true;
        minDis = Math.min(minDis, c3*d[vertex]+c1*dx[vertex]+c2*dy[vertex]);
        for(int i : list.get(vertex)){
            if(visited[i])  continue;
            dfs(i, visited, list, c1, c2, c3, d, dx, dy);
        }
    }
}

class ShortestDistanceWithUnitWeight {

    int [] distance;

    ShortestDistanceWithUnitWeight(List<List<Integer>> graph, int source){
        this.distance = new int[graph.size()];
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

    }

    public int [] getDistance(){
        return distance;
    }

}