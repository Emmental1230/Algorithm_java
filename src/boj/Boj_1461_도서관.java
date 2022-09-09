package boj;

import java.io.*;
import java.util.*;

public class Boj_1461_도서관 {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] books = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            books[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(books); // 오름차순 정렬

    }
    /*
    가까이 있는거 x
    -11 -2 6 28 29 37 39
    11 11
    28 28
    37 37
    39


    11 11 6 6
    29 29
    39

    39 39 29 29
    8 8
    11


     */
}
