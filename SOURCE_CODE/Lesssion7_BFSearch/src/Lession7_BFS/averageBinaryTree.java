package Lession7_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class averageBinaryTree {
    static class TreeNode {
        Integer val;
        TreeNode left;
        TreeNode right;

        TreeNode(Integer x) {
            val = x;
        }
    }

    public static TreeNode createBinaryTreeFromLevelOrderArray(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();
            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        if (root == null) {
            return averages;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            long sum = 0;
            int count = queue.size();

            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            averages.add((double) sum / count);
        }

        return averages;
    }

    public static void main(String[] args) {
        // Mảng input từ đề bài
        Integer[] input = new Integer[] {3, 9, 20, null, null, 15, 7};

        // Tạo cây nhị phân từ mảng input
        TreeNode root = createBinaryTreeFromLevelOrderArray(input);

        // Tính và in ra giá trị trung bình trên mỗi cấp độ của cây
        List<Double> averages = averageOfLevels(root);
        System.out.println("Average values of each level:");
        for (double avg : averages) {
            System.out.format("%.5f\n", avg);
        }
    }
}
