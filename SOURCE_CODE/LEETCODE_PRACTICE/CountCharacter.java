package LEETCODE_PRACTICE;

import java.util.HashMap;
import java.util.Map;
public class CountCharacter {
    public static void main(String[] args) {
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
