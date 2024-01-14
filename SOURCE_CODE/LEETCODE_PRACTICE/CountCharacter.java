package LEETCODE_PRACTICE;

import ThuatToanLyThuyet.LinkedList.MyFirstLinkedList;

import java.util.HashMap;
import java.util.Map;
public class CountCharacter {
    public static void main(String[] args) {


//        MyFirstLinkedList.Node n1 = new MyFirstLinkedList.Node(1);
//        MyFirstLinkedList.Node n2 = new MyFirstLinkedList.Node(2);
//        MyFirstLinkedList.Node n3 = new MyFirstLinkedList.Node(3);
//
//        n1.next = n2;
//        n2.next = n3;
//
//        printLinkedList(n1);
//
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

//        n1 = addToTail(n1, 4);
//        n1 = addToHead(n1, 0);
//        printLinkedList(n1);

//        n1 = addToHead(n1,0);
//        printLinkedList(n1);

//        Node newList =  addToHead(n1,0);
//        printLinkedList(newList);

        // "hello woes BCX MNB"
        String input = "hello woes BCX MNB";
        countCharString(input);
    }
    private static void countCharString(String input) {
        char[] convert = input.toCharArray();
        Map<Character, Integer> storeValue = new HashMap<>();

        for (char c : convert) {
            if (c != ' ') {
                if (storeValue.containsKey(c)) {
                    storeValue.put(c, storeValue.get(c) + 1);
                } else {
                    storeValue.put(c, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : storeValue.entrySet()) {
            System.out.println("Ký tự " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
        }
    }
}
