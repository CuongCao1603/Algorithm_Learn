package LEETCODE_PRACTICE;

import java.util.ArrayList;
import java.util.List;

public class SmallestEvenInteger {

//    public static int findSmallestEvenInteger(int num) {
//        // Convert the number to a string to easily manipulate digits
//        String numStr = Integer.toString(num);
//
//        // Calculate the length of the number
//        int length = numStr.length();
//
//        // If the number is not even, make it even by incrementing it
//        if (num % 2 != 0) {
//            num++;
//        }
//
//        // Continue checking until a valid number is found
//        while (true) {
//            // Convert the current number to string for digit manipulation
//            String currentNumStr = Integer.toString(num);
//
//            // Check if the length of the current number matches the original number
//            if (currentNumStr.length() != length) {
//                num += 2; // Skip odd numbers
//                continue;
//            }
//
//            // Calculate the product of front-n digits and tail-n digits
//            int frontProduct = 1;
//            int tailProduct = 1;
//
//            for (int i = 0; i < length / 2; i++) {
//                frontProduct *= Character.getNumericValue(currentNumStr.charAt(i));
//                tailProduct *= Character.getNumericValue(currentNumStr.charAt(length - 1 - i));
//            }
//
//            // If the products are equal, return the current number
//            if (frontProduct == tailProduct) {
//                return num;
//            }
//
//            // Increment by 2 to get the next even number
//            num += 2;
//        }

//    }


    public static void main(String[] args) {
        int num = 1234577;
//        int num2 = convertEvenNum(num);
        int result = findSmallestEvenInteger(num);
        System.out.println("The smallest even integer following the conditions is: " + result);
    }

    private static int findSmallestEvenInteger(int num) {
        int num2 = (num % 2 == 0) ? num : num + 1;
//        boolean checkNumber = checkNumberEven(num2);
        while (!checkNumberEven(num2)) {
            num2 += 2;
        }
        return num2;
    }

    private static boolean checkNumberEven(int num2) {
        List<Integer> array = new ArrayList();
//        int temp;
        while (num2 != 0) {
            array.add(num2 % 10);
            num2 /= 10;

        }
        int size = array.size();
        if (size % 2 == 0) {
            int tichFront = 1;
            int tichTail = 1;
            int n = size / 2;
            for (int i = 0; i < n; i++) {

                tichFront *= array.get(i);
//                System.out.println("Front val: " + tichFront);

            }
            for (int i = n; i < size; i++) {
                tichTail *= array.get(i);

            }
//            System.out.println("Tail val: " + tichTail + "Front val: " + tichFront);
            if (tichTail == tichFront) {
                return true;
            }
        }else if(size % 2 != 0){
            return true;
        }
        return false;

    }
}

