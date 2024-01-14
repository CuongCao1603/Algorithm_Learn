package PRACTICE_HOME_WORK;

import java.util.*;

public class WaterJugProblem {

    static class State {
        int a, b, c;

        public State(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b, c);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            State state = (State) obj;
            return a == state.a && b == state.b && c == state.c;
        }
    }

    public static int minMovesToReachTarget(int target) {
        State start = new State(0, 0, target);
        Map<State, Integer> distance = new HashMap<>();
        Queue<State> queue = new LinkedList<>();

        queue.offer(start);
        distance.put(start, 0);

        while (!queue.isEmpty()) {
            State current = queue.poll();

            if (current.c == 0) {
                return distance.get(current);
            }

            move(current.a, current.b, current.c, distance, queue);
            move(current.a, current.c, current.b, distance, queue);
            move(current.b, current.a, current.c, distance, queue);
            move(current.b, current.c, current.a, distance, queue);
            move(current.c, current.a, current.b, distance, queue);
            move(current.c, current.b, current.a, distance, queue);
        }

        return -1;
    }

    private static void move(int from, int to, int other, Map<State, Integer> distance, Queue<State> queue) {
        if (from > 0) {
            int amount = Math.min(from, to - other);
            int remaining = from - amount;
            State nextState = new State(remaining, to + amount, other);

            // Check if nextState is already in distance map
            if (!distance.containsKey(nextState)) {
                int newDistance = distance.getOrDefault(nextState, 0) + 1;

                // Cập nhật khoảng cách và thêm vào hàng đợi
                distance.put(nextState, newDistance);
                queue.offer(nextState);
            }
        }
    }



    public static void main(String[] args) {
        int target = 5;
        int moves = minMovesToReachTarget(target);

        if (moves != -1) {
            System.out.println("Số bước ngắn nhất để rót qua rót lại 3 bình a b c và tìm được d lít là: " + moves);
        } else {
            System.out.println("Không có cách để rót qua rót lại 3 bình a b c và tìm được d lít.");
        }
    }
}
