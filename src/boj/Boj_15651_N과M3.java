package boj;

import java.io.*;
import java.util.*;

public class Boj_15651_N과M3 {static int N, M;
    static StringBuilder sb = new StringBuilder();
    static int[] numbers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        numbers = new int[N + 1];
        combination(0);
        System.out.println(sb);

    }

    static void combination(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(numbers[i]).append(" ");
            }
            sb.append("\n");
            return;
        } else {
            for (int i = 1; i <= N; i++) {

                numbers[depth] = i;
                combination(depth + 1);
            }
        }
    }
}