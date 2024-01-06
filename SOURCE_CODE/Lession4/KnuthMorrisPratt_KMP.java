package Lession4;

public class KnuthMorrisPratt_KMP {

    public static void main(String[] args) {
        String text = "abcxabcabcaby";
        String pattern = "abcaby";

        boolean result = searchPatternByKMP(text, pattern);

        if (result) {
            System.out.println("true");
        } else {
            System.out.println("Not found");
        }

    }

    private static boolean searchPatternByKMP(String text, String pattern) {
        int i = 0, j = 0;
        int[] prefixTable = buildPrefixTable(pattern);

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                return true;
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j == 0) {
                    i++;
                } else {
                    j = prefixTable[j - 1];
                }
            }
        }

        return false;
    }

    public static int[] buildPrefixTable(String pattern) {
        int[] prefixTable = new int[pattern.length()];

        int i = 0;
        int j = 1;

        while (j < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                prefixTable[j] = i + 1;
                i++;
                j++;
            } else {
                if (i == 0) {
                    prefixTable[j] = 0;
                    j++;
                } else {
                    i = prefixTable[i - 1];
                }
            }
        }

        return prefixTable;
    }
}


//    private static boolean searchPatternByKMP(String text, String pattern) {
//        int i = 0, j = 0;
//        int[] prefixTable = buildPrefixTable(pattern);
////        prefixTable =
//
//
//        for (int k = 0; k < pattern.length(); k++) {
//            prefixTable[k] = pattern.charAt(k);
//        }
//
//        while (i < text.length()) {
//            if (text.charAt(i) == pattern.charAt(j)) {
//                i++;
//                j++;
//            }
//            if (j == pattern.length()) {
//                return true;
//            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
//                if (j == 0) {
//                    i++;
//                } else {
//                    j = prefixTable[j - 1];
//                }
//            }
//
//
//        }
//
//        return false;
//    }
//
//    public static int[] buildPrefixTable(String pattern) {
//        int[] prefixTable = new int[pattern.length()];
//
//        int i = 0;
//        int j = 1;
//
//        while (j < pattern.length()) {
//            if (pattern.charAt(i) == pattern.charAt(j)) {
//                prefixTable[j] = i + 1;
//                i++;
//                j++;
//            } else {
//                if (i == 0) {
//                    prefixTable[j] = 0;
//                    j++;
//                } else {
//                    i = prefixTable[i - 1];
//                }
//            }
//        }
//
//        return prefixTable;
//    }


//}
