package ThuatToanThamLam;

import ThuatToanLyThuyet.LinkedList.MyFirstLinkedList;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dijsktra {

    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int graph[][] = new int[][]{{0, 0, 1, 2, 0, 0, 0}, {0, 0, 2, 0, 0, 3, 0}, {1, 2, 0, 1, 3, 0, 0},
                {2, 0, 1, 0, 0, 0, 1}, {0, 0, 3, 0, 0, 2, 0}, {0, 3, 0, 0, 2, 0, 1}, {0, 0, 0, 1, 0, 1, 0}};
        int[] distance = dijkstra(graph, 0);

        System.out.println(Arrays.toString(distance));

//        for (int i = 0; i < graph.length; i++) {
//            System.out.println();
//            for (int j = 0; j < graph.length; j++) {
//                System.out.print(graph[i][j] + " ");
//            }
//        }
    }

    private static int[] dijkstra(int[][] graph, int start) {

        int V = graph.length;
        int[] distance = new int[V];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = INF;
        }

        // Lay phan tu be nhat or lon nhat trong queue
        PriorityQueue<Node> PQ = new PriorityQueue<Node>();
        distance[start] = 0;
        PQ.add(new Node(start, distance[start]));

        while (!PQ.isEmpty()) {
            Node curr = PQ.remove();
            int u = curr.n;

            for (int i = 0; i < V; i++) {
                if (graph[u][i] > 0) {
                    int v = i;
                    if (distance[v] > distance[u] + graph[u][v]) {
                        distance[v] = distance[u] + graph[u][v];
                        PQ.add(new Node(v, distance[v]));
                    }
                }
            }
        }

        return distance;
    }

    static class Node implements Comparable<Node> {
        int n;
        int d;

        public Node(int n, int d) {
            super();
            this.n = n;
            this.d = d;
        }

        /**
         * Compares this object with the specified object for order.  Returns a
         * negative integer, zero, or a positive integer as this object is less
         * than, equal to, or greater than the specified object.
         *
         * <p>The implementor must ensure {@link Integer#signum
         * signum}{@code (x.compareTo(y)) == -signum(y.compareTo(x))} for
         * all {@code x} and {@code y}.  (This implies that {@code
         * x.compareTo(y)} must throw an exception if and only if {@code
         * y.compareTo(x)} throws an exception.)
         *
         * <p>The implementor must also ensure that the relation is transitive:
         * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
         * {@code x.compareTo(z) > 0}.
         *
         * <p>Finally, the implementor must ensure that {@code
         * x.compareTo(y)==0} implies that {@code signum(x.compareTo(z))
         * == signum(y.compareTo(z))}, for all {@code z}.
         *
         * @param o the object to be compared.
         * @return a negative integer, zero, or a positive integer as this object
         * is less than, equal to, or greater than the specified object.
         * @throws NullPointerException if the specified object is null
         * @throws ClassCastException   if the specified object's type prevents it
         *                              from being compared to this object.
         * @apiNote It is strongly recommended, but <i>not</i> strictly required that
         * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
         * class that implements the {@code Comparable} interface and violates
         * this condition should clearly indicate this fact.  The recommended
         * language is "Note: this class has a natural ordering that is
         * inconsistent with equals."
         */

        // Tim ra thang be nhat
        @Override
        public int compareTo(Node o) {
            return this.d - o.d;
        }
    }
}
