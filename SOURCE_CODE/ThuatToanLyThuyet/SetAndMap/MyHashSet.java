package ThuatToanLyThuyet.SetAndMap;

import java.util.ArrayList;

public class MyHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBucket[];

    MyHashSet() {
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }

    // return hashValue
    private int hashFunction(int key) {

        return key % SIZE;
    }

    public void add(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);

        if (keyIndex < 0) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);

        if(keyIndex >= 0){
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);


        return keyIndex >= 0;
    }

    public static void main(String[] args) {
        MyHashSet myHashSet= new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(2);

        System.out.println("mySet.contains(1): " + myHashSet.contains(1));

        myHashSet.remove(1);
        System.out.println("mySet.contains(1): " + myHashSet.contains(1));
    }

}
