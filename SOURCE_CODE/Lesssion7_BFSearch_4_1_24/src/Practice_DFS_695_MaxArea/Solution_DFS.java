package Lesssion7_BFSearch_4_1_24.src.Practice_DFS_695_MaxArea;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    int x, y;
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Solution_DFS {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("D:/FILE_CUA_CUONG/THUAT_TOAN_FSOFT_FALL23/SOURCE_CODE/" +
                "Lesssion7_BFSearch_4_1_24/src/Practice_DFS_695_MaxArea/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int TestCase = Integer.parseInt(br.readLine());

        int[][] matrix;
        for (int i = 1; i <= TestCase; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            matrix = new int[row][col];

            for (int j = 0; j < row; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < col; k++) {
                    int value = Integer.parseInt(st.nextToken());
                    matrix[j][k] = value;
                }
            }
            int result = maxAreaOfIsland(matrix);
            System.out.println("#" + i + ": " + result);
        }
    }

    private static int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    count = bfs(grid, visited, i, j, 0);
                    if(count > ans)
                        ans = count;
                }
            }
        }
        return ans;
    }

    private static int bfs(int[][] grid, boolean[][] visited, int i, int j, int count) {
        Queue<Node> Q = new LinkedList<>();
        visited[i][j] = true;
        Q.add(new Node(i, j));
        count++;

        int row = grid.length;
        int col = grid[0].length;

        while (!Q.isEmpty()) {
            Node curr = Q.remove();
            int x = curr.x;
            int y = curr.y;

            // Up
            if (curr.x > 0) {
                if (!visited[curr.x - 1][y] && grid[curr.x - 1][y] == 1) {
                    count++;
                    visited[x - 1][y] = true;
                    Q.add(new Node(x - 1, y));
                }
            }

            // Down
            if (x < row - 1) {
                if (!visited[curr.x + 1][y] && grid[curr.x + 1][y] == 1) {
                    count++;
                    visited[x + 1][y] = true;
                    Q.add(new Node(x + 1, y));
                }
            }

            // Left
            if (y > 0) {
                if (!visited[curr.x][y - 1] && grid[curr.x][y - 1] == 1) {
                    count++;
                    visited[curr.x][y - 1] = true;
                    Q.add(new Node(x, y - 1));
                }
            }

            // Right
            if (y < col - 1) {
                if (!visited[curr.x][y + 1] && grid[curr.x][y + 1] == 1) {
                    count++;
                    visited[curr.x][y + 1] = true;
                    Q.add(new Node(x, y + 1));
                }
            }
        }

        return count;
    }

}
