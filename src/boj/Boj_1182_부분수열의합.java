package boj;

import java.io.*;
import java.util.*;

public class Boj_1182_부분수열의합 {
    static int N, S;
    static int[] arr;
    static boolean[] selected;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N+2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        func(0, 0);

        if(S == 0)
            System.out.println(res-1);
        else
            System.out.println(res);
    }

    public static void func(int n, int sum) {
        if (n == N) {
            if (sum == S)
                res++;
            return;
        }

        func(n + 1,sum + arr[n]);
        func(n + 1, sum);
        return;
    }

}
