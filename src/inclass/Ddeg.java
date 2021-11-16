package inclass;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Ddeg {

    public static Graph readGraph(String filename) {
        In in = new In(filename);
        int v = in.readInt();
        int e = in.readInt();
        Graph g = new Graph(v);
        for (int i = 0; i < e; i++) {
            int p = in.readInt();
            int q = in.readInt();
            g.addEdge(p - 1, q - 1);
        }
        return g;
    }

    public static void main(String[] args) {
        Graph g = readGraph("rosalind_ddeg.txt");
        StdOut.println(g);
    }

}
