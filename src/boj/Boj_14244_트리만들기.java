package boj;

import java.util.*;

public class Boj_14244_트리만들기 {
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N - M + 1; i++) {
            sb.append(i).append(" ").append(i + 1).append("\n");
        }

        for (int i = 0; i < M - 2; i++) {
            sb.append(N - M).append(" ").append(N - M + 2 + i).append("\n");
        }
        System.out.println(sb);
    }
}
