package boj;

import java.io.*;
import java.util.*;

public class Boj_21758_꿀따기 {
    static int N;
    static int[] arr;
    static int[] sum1, sum2;    // 오른쪽으로, 왼쪽으로
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        sum1 = new int[N];
        sum2 = new int[N];
        for (int i = 0; i < N; i++) {
            if (i == 0)
                sum1[i] = arr[i];
            else
                sum1[i] = sum1[i - 1] + arr[i];
        }
        for (int i = N - 1; i >= 0; i--) {
            if (i == N - 1)
                sum2[i] = arr[i];
            else 
                sum2[i] = sum2[i + 1] + arr[i];
        }

        int a, b;
        //1. a b 통
        for (int i = 1; i < N - 1; i++) {
            a = sum1[N - 1] - (arr[i] + arr[0]);
            b = sum1[N - 1] - sum1[i];
            res = Math.max(res, a + b);
        }

        //2. 통 b a
        for (int i = N-2; i > 0; i--) {
            a = sum2[0] - (arr[i] + arr[N - 1]);
            b = sum2[0] - sum2[i];
            res = Math.max(res, a + b);
        }
        
        //3. a 통 b
        for (int i = 1; i < N-1; i++) {
            a = sum1[i] - arr[0];
            b = sum2[i] - arr[N - 1];
            res = Math.max(res, a + b);
        }

        System.out.println(res);
    }
}