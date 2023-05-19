package lab_9;

public class Graph {
    int V;
    int E;

    Edge [] edge;
    Graph(int v, int e){
        this.V = v;
        this.E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }
}
