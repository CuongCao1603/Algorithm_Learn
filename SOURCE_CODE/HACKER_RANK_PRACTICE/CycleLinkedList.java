package HACKER_RANK_PRACTICE;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CycleLinkedList {
    static LinkedListNode head;

    public CycleLinkedList() {
        this.head = null;
    }

    public void append(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        LinkedListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void display() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CycleLinkedList linkedList = new CycleLinkedList();

        System.out.print("Nhập số lượng phần tử trong danh sách liên kết: ");
        int n = scanner.nextInt();

        System.out.println("Nhập giá trị cho từng phần tử:");

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            linkedList.append(value);
        }

        System.out.println("Danh sách liên kết đã nhập là:");
        linkedList.display();

        boolean checkCycle = hasCycle(linkedList);
        if(checkCycle){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }

    private static boolean hasCycle(CycleLinkedList linkedList) {

        Map<Integer, Integer> valueStore = new HashMap<>();
        LinkedListNode current = head;
        while (current != null) {

            if(valueStore.containsKey(current.data)){
                valueStore.put(current.data, valueStore.get(current.data) + 1);
                return true;
            } else{
                valueStore.put(current.data, 1);
            }
            current = current.next;
        }

        return false;
    }
}
