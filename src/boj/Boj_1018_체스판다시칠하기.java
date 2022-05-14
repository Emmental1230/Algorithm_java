package boj;

import java.util.*;
import java.io.*;

public class Boj_1018_체스판다시칠하기 {
    static int N,M;
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new char[N][M];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        int cnt = Integer.MAX_VALUE;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int cnt1 = 0;
                int cnt2 = 0;
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j+8; y++) {
                        // 첫번째가 WBWB 이어야 할때
                        if((x+y)%2 == 0 && arr[x][y] == 'B')
                            cnt1++;
                        else if((x+y)%2 == 1 && arr[x][y] == 'W')
                            cnt1++;
                        // 첫번째가 BWBW 이어야 할때
                        if((x+y)%2 == 0 && arr[x][y] == 'W')
                            cnt2++;
                        else if((x+y)%2 == 1 && arr[x][y] == 'B')
                            cnt2++;
                    }
                }
                cnt = cnt > Math.min(cnt1, cnt2) ? Math.min(cnt1, cnt2) : cnt;
            }
        }
        System.out.println(cnt);
    }
}
