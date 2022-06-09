package boj;

import java.util.*;
import java.io.*;

public class Boj_1806_부분합 {
    static int N, S;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;

        while (start <= N && end <= N) {
            // end가 S보다 커질때까지
            if (sum < S) {
                sum += arr[end++];
            } else {
                res = Math.min(res, end - start);
                sum -= arr[start++];
                System.out.printf("start : %d, end : %d%n", start, end);
            }
        }
        if(res == Integer.MAX_VALUE)
            System.out.println(0);
        else
            System.out.println(res);
    }
}
