package ThuatToanLyThuyet.Graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDFWithStack {
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
        Stack<Integer> stack = new Stack<>();
        Set<Integer> daDuyet = new HashSet<>();

        // khoi tao
        stack.add(0);
        daDuyet.add(0);

        // duyet theo stack
        while (!stack.isEmpty()){
            int u = stack.pop();
            // process u
            System.out.printf(u + " ");
            
            // add tat ca cac dinh ke v voi u ma chua duoc duyet vao stack

            for (int v = 0; v < graph.length; v++) {
                if(graph[u][v] == 1 && daDuyet.contains(v) == false){
                    stack.add(v);

                    // danh dau da duyet v
                    daDuyet.add(v);
                }
            }
        }
    }
}
