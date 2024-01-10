package Lesssion7_BFSearch_4_1_24.src.Lession7_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Tạo một hàng đợi sử dụng LinkedList
        Queue<Integer> myQueue = new LinkedList<>();

        // Thêm phần tử vào hàng đợi (offer)
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);

        // Lấy và loại bỏ phần tử từ hàng đợi (poll)
        Integer element = myQueue.poll();
        System.out.println("Element removed from the queue: " + element);

        // Hiển thị nội dung của hàng đợi
        System.out.println("Current queue: " + myQueue);
    }
}
