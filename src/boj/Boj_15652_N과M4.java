package boj;

import java.io.*;
import java.util.*;

public class Boj_15652_N과M4 {
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    static int[] numbers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        numbers = new int[N + 1];
        combination(0,1);
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
            for (int i = before; i <= N; i++) {

                numbers[depth] = i;
                combination(depth + 1, i);
            }
        }
    }
}