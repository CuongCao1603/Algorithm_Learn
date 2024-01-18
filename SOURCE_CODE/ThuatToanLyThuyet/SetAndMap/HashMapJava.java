package ThuatToanLyThuyet.SetAndMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,2};
        Map<Integer, Integer> myMap = new HashMap<>();

        // Key: gia tri cua phan tu trong mang
        for (int i :
                arr) {
            if(myMap.containsKey(i) == false){
                // i chua xuat hien trong map
                myMap.put(i,1);
            } else {
                int soLanXuatHien = myMap.get(i);
                soLanXuatHien++;
                myMap.put(i, soLanXuatHien);
            }
        }
        for (Map.Entry entry :
                myMap.entrySet()) {
            System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan!");
        }
    }
}
