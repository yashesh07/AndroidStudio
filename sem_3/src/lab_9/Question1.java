package lab_9;

public class Question1 {
    public static void main(String[] args) {

        Graph graph = new Graph(7, 10);

        graph.edge[0].source = 0;
        graph.edge[0].des = 1;
        graph.edge[0].weight = 6;

        graph.edge[1].source = 1;
        graph.edge[1].des = 4;
        graph.edge[1].weight = -1;

        graph.edge[2].source = 4;
        graph.edge[2].des = 6;
        graph.edge[2].weight = 3;

        graph.edge[3].source = 5;
        graph.edge[3].des = 6;
        graph.edge[3].weight = 3;

        graph.edge[4].source = 3;
        graph.edge[4].des = 5;
        graph.edge[4].weight = -1;

        graph.edge[5].source = 0;
        graph.edge[5].des = 3;
        graph.edge[5].weight = 5;

        graph.edge[6].source = 0;
        graph.edge[6].des = 2;
        graph.edge[6].weight = 5;

        graph.edge[7].source = 3;
        graph.edge[7].des = 2;
        graph.edge[7].weight = -2;

        graph.edge[8].source = 2;
        graph.edge[8].des = 1;
        graph.edge[8].weight = -2;

        graph.edge[9].source = 2;
        graph.edge[9].des = 4;
        graph.edge[9].weight = 1;



        new ShortestPathOfAllVerticesFromSource(graph, 0).printShortestPath();
    }
}
