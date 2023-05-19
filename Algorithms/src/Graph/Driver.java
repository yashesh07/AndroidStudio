package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

//        DisjointSet set = new DisjointSet(8);
//
//        set.joinComponent(1, 2);
//        set.joinComponent(2, 3);
//        set.joinComponent(4, 5);
//        set.joinComponent(6, 7);
//        set.joinComponent(5, 6);
//        set.joinComponent(3, 7);
//
//        System.out.println(set.inSameComponent(2, 3));
//        System.out.println(set.inSameComponent(1, 7));
//        System.out.println(set.inSameComponent(1, 0));


        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<9; i++){
            graph.add(new ArrayList<>());
        }

//        graph.get(1).add(2);
//        graph.get(2).add(1);
//
//        graph.get(1).add(4);
//        graph.get(4).add(1);
//
//        graph.get(3).add(2);
//        graph.get(2).add(3);
//
//        graph.get(3).add(4);
//        graph.get(4).add(3);
//
//        graph.get(4).add(5);
//        graph.get(5).add(4);
//
//        graph.get(5).add(6);
//        graph.get(6).add(5);
//
//        graph.get(6).add(9);
//        graph.get(9).add(6);
//
//        graph.get(6).add(7);
//        graph.get(7).add(6);
//
//        graph.get(7).add(8);
//        graph.get(8).add(7);
//
//        graph.get(9).add(8);
//        graph.get(8).add(9);
//
//        graph.get(8).add(10);
//        graph.get(10).add(8);
//
//        graph.get(10).add(11);
//        graph.get(11).add(10);
//
//        graph.get(10).add(12);
//        graph.get(12).add(10);
//
//        graph.get(11).add(12);
//        graph.get(12).add(11);
//
//        BridgesInGraph bridgesInGraph = new BridgesInGraph(graph);
//        ArticulationPoint articulationPoint = new ArticulationPoint(graph);


//        graph.get(0).add(new int[]{1, 4});
//        graph.get(0).add(new int[]{7, 8});
//        graph.get(1).add(new int[]{0, 4});
//        graph.get(1).add(new int[]{7, 11});
//        graph.get(1).add(new int[]{2, 8});
//        graph.get(2).add(new int[]{1, 8});
//        graph.get(2).add(new int[]{8, 2});
//        graph.get(2).add(new int[]{5, 4});
//        graph.get(2).add(new int[]{3, 7});
//        graph.get(3).add(new int[]{2, 7});
//        graph.get(3).add(new int[]{5, 14});
//        graph.get(3).add(new int[]{4, 9});
//        graph.get(4).add(new int[]{3, 9});
//        graph.get(4).add(new int[]{5, 10});
//        graph.get(5).add(new int[]{4, 10});
//        graph.get(5).add(new int[]{3, 14});
//        graph.get(5).add(new int[]{2, 4});
//        graph.get(5).add(new int[]{6, 2});
//        graph.get(6).add(new int[]{5, 2});
//        graph.get(6).add(new int[]{8, 6});
//        graph.get(6).add(new int[]{7, 1});
//        graph.get(7).add(new int[]{0, 8});
//        graph.get(7).add(new int[]{1, 11});
//        graph.get(7).add(new int[]{8, 7});
//        graph.get(7).add(new int[]{6, 1});
//        graph.get(8).add(new int[]{7, 7});
//        graph.get(8).add(new int[]{6, 6});
//        graph.get(8).add(new int[]{2, 2});
//
//        PrimsAlgorithm p = new PrimsAlgorithm(graph);
//        System.out.println();

//        int [][] edge = new int[9][3];
//        edge[0][1] = 5;
//        edge[0][2] = 4;
//        edge[0][0] = 9;
//
//        edge[1][1] = 5;
//        edge[1][2] = 1;
//        edge[1][0] = 4;
//
//        edge[2][1] = 4;
//        edge[2][2] = 1;
//        edge[2][0] = 1;
//
//        edge[3][1] = 1;
//        edge[3][2] = 2;
//        edge[3][0] = 2;
//
//        edge[4][1] = 4;
//        edge[4][2] = 2;
//        edge[4][0] = 3;
//
//        edge[5][1] = 4;
//        edge[5][2] = 3;
//        edge[5][0] = 5;
//
//        edge[6][1] = 3;
//        edge[6][2] = 6;
//        edge[6][0] = 8;
//
//        edge[7][1] = 2;
//        edge[7][2] = 6;
//        edge[7][0] = 7;
//
//        edge[8][1] = 3;
//        edge[8][2] = 2;
//        edge[8][0] = 3;
//
//
//        KruskalsAlgorithm k = new KruskalsAlgorithm(edge, 7);

        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(1);
        graph.get(2).add(6);
        graph.get(3).add(0);
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(4).add(3);
        graph.get(4).add(5);
        graph.get(5).add(4);
        graph.get(5).add(6);
        graph.get(6).add(2);
        graph.get(6).add(5);
        graph.get(6).add(7);
        graph.get(6).add(8);
        graph.get(7).add(6);
        graph.get(7).add(8);
        graph.get(8).add(6);
        graph.get(8).add(7);

        ShortestDistanceWithUnitWeight o = new ShortestDistanceWithUnitWeight(graph, 0);

    }
}
