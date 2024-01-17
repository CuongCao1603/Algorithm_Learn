package ThuatToanLyThuyet.LinkedList;

public class Reverse_LinkedList {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head){
        ListNode curNode = head;

        while (curNode != null && curNode.next != null){
            ListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }

//    class LinkedList {
//        Node head;
//
//        public LinkedList() {
//            this.head = null;
//        }
//
//        // Phương thức để thêm một nút vào cuối danh sách liên kết
//        public void append(int data) {
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = newNode;
//                return;
//            }
//            Node last = head;
//            while (last.next != null) {
//                last = last.next;
//            }
//            last.next = newNode;
//        }
//
//        // Phương thức để hiển thị danh sách liên kết
//        public void display() {
//            Node current = head;
//            while (current != null) {
//                System.out.print(current.data + " ");
//                current = current.next;
//            }
//            System.out.println();
//        }
//    }

//    // Phương thức để thêm một nút vào cuối danh sách liên kết
//    public void append(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node last = head;
//        while (last.next != null) {
//            last = last.next;
//        }
//        last.next = newNode;
//    }
//
//    // Phương thức để hiển thị danh sách liên kết
//    public void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//}


    public static void printLinkedList(ListNode head){
        while (head !=null){
            System.out.printf("%d ", head.val);
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       ListNode a1 = new ListNode(1);
       ListNode a2 = new ListNode(2);
       ListNode a3 = new ListNode(3);
       a1.next = a2; a2.next = a3;

       printLinkedList(a1);
      ListNode newList = reverseList(a1);
      printLinkedList(newList);
    }
}
