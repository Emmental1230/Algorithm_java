package boj;
import java.io.*;
import java.util.*;

public class Boj_15654_N과M5 {
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int[] numbers, inputs;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N];
        numbers = new int[N];
        inputs = new int[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = sc.nextInt();
        }
        Arrays.sort(inputs);

        permutation(0);
        System.out.println(sb);

    }

    static void permutation(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(numbers[i]).append(" ");
            }
            sb.append("\n");
            return;
        } else {
            for (int i = 0; i < N; i++) {
                if (visited[i])
                    continue;

                numbers[depth] = inputs[i];
                visited[i] = true;
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }
}