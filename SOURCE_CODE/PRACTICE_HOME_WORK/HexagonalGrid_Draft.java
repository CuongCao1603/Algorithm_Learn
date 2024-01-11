package PRACTICE_HOME_WORK;

import java.io.*;
import java.util.StringTokenizer;

public class HexagonalGrid_Draft {
    private static BufferedReader br;

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
                Integer.parseInt(br.readLine());

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

            System.out.println();
            System.out.println("#" + i + ": " + result);
        }

    }

    private static int maxValueMatrix(int[][] grid) {
        int ans = 0;
        row = grid.length;
        col = grid[0].length;

        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                visited = new boolean[row][col]; // Khởi tạo mảng visited mới
                int sum = dfs4Node(visited, i, j, 0, 0);
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
    private static int dfs4Node(boolean[][] visited, int x, int y, int sum, int count) {
        if (x < 0 || x >= row || y < 0 || y >= col || visited[x][y] || count == 4) {
            return sum;
        }

        visited[x][y] = true;
        sum += grid[x][y];

        int maxSum = sum;

        // Up
        if (x > 0) {
            maxSum = Math.max(maxSum, dfs4Node(visited, x - 1, y, sum, count + 1));
        }

        // Down
        if (x < row - 1) {
            maxSum = Math.max(maxSum, dfs4Node(visited, x + 1, y, sum, count + 1));
        }

        // Left
        if (y > 0) {
            maxSum = Math.max(maxSum, dfs4Node(visited, x, y - 1, sum, count + 1));
        }

        // Right
        if (y < col - 1) {
            maxSum = Math.max(maxSum, dfs4Node(visited, x, y + 1, sum, count + 1));
        }

        // Up-right and Down-right (dependent on the row being even or odd)
        if (x % 2 == 0) {
            // For even rows
            if (x > 0 && y < col - 1) {
                maxSum = Math.max(maxSum, dfs4Node(visited, x - 1, y + 1, sum, count + 1)); // Up-right
            }
            if (x < row - 1 && y < col - 1) {
                maxSum = Math.max(maxSum, dfs4Node(visited, x + 1, y + 1, sum, count + 1)); // Down-right
            }
        } else {
            // For odd rows
            if (x > 0 && y > 0) {
                maxSum = Math.max(maxSum, dfs4Node(visited, x - 1, y - 1, sum, count + 1)); // Up-right
            }
            if (x < row - 1 && y > 0) {
                maxSum = Math.max(maxSum, dfs4Node(visited, x + 1, y - 1, sum, count + 1)); // Down-right
            }
        }
        // Đặt lại trạng thái của điểm này là chưa thăm
        visited[x][y] = false;

        return maxSum;
    }


}
