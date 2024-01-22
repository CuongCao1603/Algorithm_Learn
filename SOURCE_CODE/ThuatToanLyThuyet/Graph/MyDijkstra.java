package ThuatToanLyThuyet.Graph;

import java.util.HashSet;
import java.util.Set;

public class MyDijkstra {

    public static void main(String[] args) {
        int n = 5;
        int[][] a = {
                {0, 6, 0, 1, 0},
                {6, 0, 5, 2, 2},
                {0, 5, 0, 0, 5},
                {1, 2, 0, 0, 1},
                {0, 2, 5, 1, 0}
        };

        Set<Integer> visited = new HashSet<>();
        int[] distance = new int[n];  // distance[i]: khoang cach tu dinh dau cho den i
        int[] previous = new int[n];

        int start = 0;
        int finish = 2;

        int oo = Integer.MAX_VALUE;

        // B1: Khoi tao khoang cach

        for (int i = 0; i < n; i++) {
            distance[i] = oo;
        }
        distance[start] = 0;


        while (visited.size() < n) {

            // BUuowsc2: Chọn đỉnh chưa duyệt
//            và đang có khoảng cách nhỏ nhất ( từ đỉnh xuất phát) làm đỉnh đang xét

            int dangXet = 0;
            int minDist = oo;

            for (int i = 0; i < n; i++) {
                if (visited.contains(i) == false && distance[i] < minDist) {
                    minDist = distance[i];
                    System.out.println("Test value distance: " + distance[i]);
                    dangXet = i;
                }
            }

//            buBuowsc3: Từ đỉnh đang xét, duyệt các đỉnh kề chưa duyệt:
//            update khoảng cách và đỉnh trước của các đỉnh đó.

            for (int i = 0; i < n; i++) {
                if (visited.contains(i) == false && a[dangXet][i] != 0) {
                    int newDistance = distance[dangXet] + a[dangXet][i];
                    if (newDistance < distance[i]) {
                        distance[i] = newDistance;
                        previous[i] = dangXet;
                    }
                }
            }

            // Buoc4: Danh dau dinh dang dang xet thanh dinh da duyet
            visited.add(dangXet);
        }
        System.out.println("Khoang cách nhỏ nhất từ " + start + " đến " + finish + ": " + distance[finish]);

        System.out.println("Duong di la: ");
        int chay = finish;
        while (chay != start) {
            System.out.print(chay + " <- ");
            chay = previous[chay];
        }
        System.out.print(chay);
    }
}
