package inclass;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/** Rosalind problem DEG. */
public class Deg {

    public static void main(String[] args) {
        In in = new In("rosalind_deg.txt");
        // Read the graph
        int v = in.readInt();
        int e = in.readInt();
        int[] degrees = new int[v];
        for (int i = 0; i < e; i++) {
            int p = in.readInt() - 1;
            int q = in.readInt() - 1;
            degrees[p]++;
            degrees[q]++;
        }
        // Print the output
        for (int i = 0; i < v; i++) {
            StdOut.print(degrees[i] + " ");
        }
    }

}
