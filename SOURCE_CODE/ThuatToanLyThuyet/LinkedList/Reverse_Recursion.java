package ThuatToanLyThuyet.LinkedList;

public class Reverse_Recursion {
    public static class ListNodeRecursion {
        int val;
        ListNodeRecursion next;

        public ListNodeRecursion() {
        }

        public ListNodeRecursion(int val) {
            this.val = val;
        }

        public ListNodeRecursion(int val, ListNodeRecursion next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNodeRecursion reverseList(ListNodeRecursion head) {
        // TH co so
        if (head == null)
            return null;
        ListNodeRecursion nextNode = head.next;
//        TH1 1 node
        if (nextNode == null){
            printLinkedList(head);
            return head;
        }


//        TH TQ
        ListNodeRecursion newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        printLinkedList(newHead);
        return newHead;
    }

    public static void printLinkedList(ListNodeRecursion head){
        while (head!=null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNodeRecursion n1 = new ListNodeRecursion(1);
        ListNodeRecursion n2 = new ListNodeRecursion(2);
        ListNodeRecursion n3 = new ListNodeRecursion(3);
        ListNodeRecursion n4 = new ListNodeRecursion(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printLinkedList(n1);
        ListNodeRecursion newHead = reverseList(n1);
        System.out.println("---------------------");
        printLinkedList(newHead);


    }
}
