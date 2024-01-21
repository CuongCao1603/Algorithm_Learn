package ThuatToanLyThuyet.Graph;

import java.util.*;

public class SampleBFSWithQueue {
    public static void main(String[] args) {
        int[][] graph = {
                {0,1,0,0,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,0,1,0},
                {0,1,0,0,0,1,1},
                {0,1,0,0,0,0,1},
                {0,0,1,1,0,0,0},
                {0,0,0,1,1,0,0}
        };

        // khai bao
        Queue<Integer>  queue = new LinkedList<>();
        Set<Integer> daDuyet = new HashSet<>();

        // khoi tao
        queue.add(0);
        daDuyet.add(0);

        // duyet theo stack
        while (!queue.isEmpty()){
            int u = queue.poll();
            // process u
            System.out.printf(u + " ");

            // add tat ca cac dinh ke v voi u ma chua duoc duyet vao stack

            for (int v = 0; v < graph.length; v++) {
                if(graph[u][v] == 1 && daDuyet.contains(v) == false){
                    queue.add(v);

                    // danh dau da duyet v
                    daDuyet.add(v);
                }
            }
        }
    }
}
