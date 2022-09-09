package boj;

import java.io.*;
import java.util.*;

public class Boj_15650_N과M2 {
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int[] numbers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N + 1];
        numbers = new int[N + 1];
        combination(0, 0);
        System.out.println(sb);

    }

    static void combination(int depth, int before) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(numbers[i]).append(" ");
            }
            sb.append("\n");
            return;
        } else {
            for (int i = before + 1; i <= N; i++) {
                if (visited[i])
                    continue;

                numbers[depth] = i;
                visited[i] = true;
                combination(depth + 1, i);
                visited[i] = false;
            }
        }
    }
}