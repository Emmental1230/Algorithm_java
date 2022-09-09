package boj;

import java.io.*;
import java.util.*;

public class Boj_15655_N과M6 {
    static int N, M;
    static int[] inputs, numbers;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        inputs = new int[N];
        numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(inputs);

        combination(0, 0);
        System.out.println(sb);
    }

    public static void combination(int depth, int beforeIdx) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(numbers[i]).append(" ");
            }
            sb.append("\n");
            return;
        } else {
            for (int i = beforeIdx; i < N; i++) {
                numbers[depth] = inputs[i];
                combination(depth + 1, i + 1);
            }
        }
    }
}
