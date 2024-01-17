package ThuatToanLyThuyet.Stack_Queue;

public class MyMain {
    public static void main(String[] args) {

        MyLinkedListQueue queue = new MyLinkedListQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.show();

        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();

//        MyLinkedListStack stack = new MyLinkedListStack();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.show();
//
//        System.out.println("Test pop: " + stack.pop());
//        stack.show();
//        System.out.println("Test pop: " + stack.pop());
//        stack.show();
//        System.out.println("Test pop: " + stack.pop());
//        stack.show();
//        System.out.println("Test pop: " + stack.pop());
//        stack.show();


//        MyArrayQueue queue = new MyArrayQueue(3);
//        System.out.println(queue.push(1));
//        System.out.println(queue.count());
//        System.out.println(queue.push(2));
//        System.out.println(queue.count());
//        System.out.println(queue.push(3));
//        System.out.println(queue.count());
//        System.out.println(queue.push(4));
//        System.out.println(queue.count());
//        queue.show();
//        System.out.println(queue.pop());
//        System.out.println(queue.count());
//        queue.show();
//        System.out.println(queue.pop());
//        System.out.println(queue.count());
//        queue.show();
//        System.out.println(queue.pop());
//        System.out.println(queue.count());
//        queue.show();
//        System.out.println(queue.pop());
//        System.out.println(queue.count());
//        queue.show();


//        MyArrayStack myArrayStack = new MyArrayStack(3);
//
//        myArrayStack.push(1);
//        myArrayStack.push(2);
//        myArrayStack.push(3);
//        myArrayStack.push(4);
//        myArrayStack.show();
//
//        myArrayStack.pop();
//        myArrayStack.show();
//        myArrayStack.pop();
//        myArrayStack.show();
//        myArrayStack.pop();
//        myArrayStack.show();
    }
}
