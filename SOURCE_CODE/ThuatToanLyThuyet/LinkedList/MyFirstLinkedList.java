package ThuatToanLyThuyet.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class MyFirstLinkedList {

    public static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        }
        else
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);

        if (headNode != null) {
            newNode.next = headNode;

        }
        return newNode;
    }

    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);

        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            // B2. Gan next cho lastNode = new Node
            lastNode.next = newNode;

        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index) {
        if (index == 0) {
            return addToHead(headNode, value);
        } else {
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;

            while (curNode != null) {
                count++;
                if (count == index) {
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }

        return headNode;
    }

    public static Node removeAtHead(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtTail(Node headNode) {
        if (headNode == null) {
            return null;
        }

        Node lastNode = headNode;
        Node prevNode = null;

        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if (prevNode == null) {
            return null;
        } else {
            prevNode.next = lastNode.next;
        }

        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index) {
        if (headNode == null || index < 0) {
            return null;
        }
        if (index == 0) {
          return  removeAtHead(headNode);
        }
        Node currNode = headNode;
        Node prevNode = null;

        int count = 0;
        boolean bIsFound = false;
        while (currNode != null) {
            if (count == index) {
                // Remove currNode
                bIsFound = true;
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }
        // Remove curr
        if (bIsFound) {
            if (prevNode == null) { // Current Node is Last Node
                return null;
            } else {
                if (currNode != null) {
                    prevNode.next = currNode.next;
                }
            }

        }

        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);

//        n1 = removeAtIndex(n1, 0);
//        printLinkedList(n1);
//        n1 = removeAtIndex(n1, 1);
//        printLinkedList(n1);
//        n1 = removeAtIndex(n1, 1);
//        printLinkedList(n1);


//        n1 = removeAtTail(n1);
//        printLinkedList(n1);
//        n1 = removeAtTail(n1);
//        printLinkedList(n1);


//        n1 = removeAtHead(n1);
//        printLinkedList(n1);
//        n1 = removeAtHead(n1);
//        printLinkedList(n1);


//        n1 = addToIndex(n1, 0,0);
//        printLinkedList(n1);
//        n1 = addToIndex(n1, 4, 0);
//        printLinkedList(n1);
//        n1 = addToIndex(n1, 1,1);
//        printLinkedList(n1);

        n1 = addToTail(n1, 4);
        System.out.println("Test: " + n1.value);
        n1 = addToHead(n1, 0);
        printLinkedList(n1);
        n1 = addToTail(n1, 7);
        System.out.println("Test2: " + n1.value);
        printLinkedList(n1);

//        n1 = addToHead(n1,0);
//        printLinkedList(n1);

//        Node newList =  addToHead(n1,0);
//        printLinkedList(newList);


    }


}
