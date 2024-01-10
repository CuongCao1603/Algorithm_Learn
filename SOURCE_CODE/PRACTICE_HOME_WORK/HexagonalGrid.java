package PRACTICE_HOME_WORK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HexagonalGrid {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 8, 5, 8, 8},
                {1, 4, 2, 3, 8},
                {1, 8, 9, 1, 5},
                {6, 0, 8, 4, 9},
                {2, 3, 6, 7, 7}
        };

        List<int[]> smallestGroup = findSmallestHexGroup(matrix);
        int groupSum = calculateGroupSum(matrix, smallestGroup);

        System.out.println("Smallest group:");
        for (int[] cell : smallestGroup) {
            int row = cell[0];
            int col = cell[1];
            int value = matrix[row][col];
            System.out.println("Position: (" + row + ", " + col + "), Value: " + value);
        }
        System.out.println("Group sum: " + groupSum);

        System.out.println("Smallest group: " + Arrays.deepToString(smallestGroup.toArray()));
        System.out.println("Group sum: " + groupSum);
    }

    private static List<int[]> findSmallestHexGroup(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int minSum = Integer.MAX_VALUE;
        List<int[]> minGroup = new ArrayList<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int[][] neighbors = {
                        {r - 1, c}, {r - 1, c + 1},
                        {r, c - 1}, {r, c + 1},
                        {r + 1, c - 1}, {r + 1, c}
                };

                List<int[]> validNeighbors = getValidNeighbors(neighbors, rows, cols);

                if (validNeighbors.size() == 6) {
                    List<int[]> group = new ArrayList<>();
                    group.add(new int[]{r, c});
                    group.addAll(validNeighbors);

                    int groupSum = calculateGroupSum(matrix, group);

                    if (groupSum < minSum) {
                        minSum = groupSum;
                        minGroup = group;
                    }
                }
            }
        }

        return minGroup;
    }

    private static List<int[]> getValidNeighbors(int[][] neighbors, int rows, int cols) {
        List<int[]> validNeighbors = new ArrayList<>();

        for (int[] neighbor : neighbors) {
            int nr = neighbor[0];
            int nc = neighbor[1];

            if (0 <= nr && nr < rows && 0 <= nc && nc < cols) {
                validNeighbors.add(new int[]{nr, nc});
            }
        }

        return validNeighbors;
    }

    private static int calculateGroupSum(int[][] matrix, List<int[]> group) {
        int sum = 0;
        for (int[] cell : group) {
            sum += matrix[cell[0]][cell[1]];

        }
        return sum;
    }
}

