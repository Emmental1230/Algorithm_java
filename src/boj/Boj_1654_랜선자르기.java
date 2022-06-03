package boj;

import java.util.*;
import java.io.*;

public class Boj_1654_랜선자르기 {
    static int K, N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[K];

        // 배열 입력 받기
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        // 기준 수 초기화 : 최댓값
        long start = 0;
        long end = arr[arr.length - 1] + 1;
        long mid;
        long count;

        while (start < end) {
            mid = (start + end) / 2;
            count = 0;  // 초기화

            // num으로 잘라보기
            for (int i = 0; i < K; i++) {
                count += (arr[i] / mid );
            }

            // 이미 만들 수 있는 상태라면,
            if (count >= N) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        System.out.println(start -1);
    }
}

