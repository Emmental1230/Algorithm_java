package boj;

import java.io.*;
import java.util.*;

public class Boj_16918_봄버맨 {
    static int R, C, N;
    static int[][] arr;
    static boolean[][] boom;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[R][C];
        boom = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                if (line.charAt(j) == 'O') {
                    arr[i][j] = 3;  // 폭탄이 있는 곳
                } else {
                    arr[i][j] = 0; // 폭탄이 없는 곳
                }
            }
        }

        timeCount();
        N--;

        for (int i = 0; i < N; i++) {
            boom = new boolean[R][C];

            timeCount();
            setBomb();
        }
        print();
    }
    public static void timeCount(){
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == 1) {

                    boom[i][j] = true;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if( nx >=0 && nx < R && ny >= 0 && ny < C)
                            boom[nx][ny] = true;
                    }
                } else if (arr[i][j] > 1)
                    arr[i][j] -= 1;
            }
        }

        // 폭탄 터지기
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (boom[i][j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static void setBomb() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == 0 && !boom[i][j]) {
                    arr[i][j] = 3;
                }
            }
        }
    }

    public static void print() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(arr[i][j] >0) sb.append("O");
                else sb.append(".");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
