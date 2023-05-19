package lab_9;

public class ShortestPathOfAllVerticesFromSource {

    Graph graph;
    int sourceVertex;

    ShortestPathOfAllVerticesFromSource(Graph graph, int sourceVertex){
        this.graph = graph;
        this.sourceVertex = sourceVertex;
    }

    void printShortestPath(){
        int V = graph.V;
        int E = graph.E;
        int [] dist = new int[V];
        for(int i = 0; i<V; i++)
            dist[i] = Integer.MAX_VALUE;
        dist[sourceVertex] = 0;

        for (int i = 1; i < V; ++i) {
            for (int j = 0; j < E; ++j) {
                int u = graph.edge[j].source;
                int v = graph.edge[j].des;
                int weight = graph.edge[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
                    dist[v] = dist[u] + weight;
            }
        }

        for (int j = 0; j < E; ++j) {
            int u = graph.edge[j].source;
            int v = graph.edge[j].des;
            int weight = graph.edge[j].weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }

        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; ++i)
            System.out.println(i + "\t\t" + dist[i]);
    }

}
