package PRACTICE_HOME_WORK;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//class NodePractice {
//    int x, y;
//
//    public NodePractice(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
public class HexagonalGrid_Draft {
    private static BufferedReader br;

    //    private static TreeNodeRetake[] trees;
    private static int len;

    //    private static int row;
//    private static int col;
    private static int[][] grid;

    static int row;
    static int col;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("D:/FILE_CUA_CUONG/THUAT_TOAN_FSOFT_FALL23" +
                "/SOURCE_CODE/PRACTICE_HOME_WORK/input.txt"));
        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int TestCase =
//                2
                Integer.parseInt(br.readLine())
                ;

        int[][] matrix;
        for (int i = 0; i < 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());

            grid = new int[row][col];

            for (int j = 0; j < row; j++) {
                System.out.println("Value row ");
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < col; k++) {

                    int value = Integer.parseInt(st.nextToken());
                    grid[j][k] = value;
                    System.out.printf(" " + grid[j][k]);
                }

            }
            int result = maxValueMatrix(grid);

            System.out.println("#" + i + ": " + result);
        }

    }

    private static int maxValueMatrix(int[][] grid) {
        int ans = 0;
        row = grid.length;
        col = grid[0].length;
        int sum = 0;

        boolean[][] visited;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
//                if (j % 2 == 1) {
                visited = new boolean[i][j];
                sum = dfs4Node(visited, i, j, sum, 1);
//                    if (sum > ans)
//                        ans = sum;
//                }
//                if (j % 2 == 0) {
//                    sum = dfs4NodeChan(grid, i, j, sum, 1);
//                    if (sum > ans)
//                        ans = sum;
//                }
            }
        }
        return ans;
    }

    private static int dfs4NodeChan(int[][] grid, int x, int y, int sum, int count) {
//        count++;
        int row = grid.length;
        int col = grid[0].length;
        sum += grid[x][y];

        if (count == 4)
//        {
            return sum;
//        }
        if (x > 0)
//        {
            return dfs4NodeChan(grid, x - 1, y, sum, count++);
//        }

        // Down
        if (x < row - 1)
//        {
            return dfs4NodeChan(grid, x + 1, y, sum, count++);
//        }

        // Left
        if (y > 0)
//        {
            return dfs4NodeChan(grid, x, y - 1, sum, count++);
//        }

        // Right
        if (y < col - 1)
//        {
            return dfs4NodeChan(grid, x, y + 1, sum, count++);
//        }

        // x + 1, y + 1
        if (x + 1 < row && y + 1 < col)
//        {
            return dfs4NodeChan(grid, x + 1, y + 1, sum, count++);
//        }

        // x -1 , y + 1
        if (y + 1 < col && x > 0)
//        {

            return dfs4NodeChan(grid, x - 1, y + 1, sum, count++);
//        }

        return sum;
    }

    private static int dfs4Node(boolean[][] visited, int x, int y, int sum, int count) {

//        count++;
//        visited[x][y] = true;
        sum += grid[x][y];
        System.out.print("Value grid: " + grid[x][y]);

        System.out.println("Test count: " + count);
        System.out.println("Test sum: " + sum);
        System.out.println("--------------------------------");
        if (count == 4) {
            return sum;
        } else {
            if (x > 0) {
                dfs4Node(visited, x - 1, y, sum, count + 1);
            }

            // Down
            if (x < row - 1) {
                dfs4Node(visited, x + 1, y, sum, count + 1);
            }

            // Left
            if (y > 0) {
                dfs4Node(visited, x, y - 1, sum, count + 1);
            }

            // Right
            if (y < col - 1) {
                dfs4Node(visited, x, y + 1, sum, count + 1);
            }

            // x + 1, y + 1
            if (x + 1 < row && y + 1 < col) {
                dfs4Node(visited, x + 1, y + 1, sum, count + 1);
            }

            // x -1 , y + 1
            if (y + 1 < col && x > 0) {

                dfs4Node(visited, x - 1, y + 1, sum, count + 1);
            }
        }
        return sum;

    }
}
