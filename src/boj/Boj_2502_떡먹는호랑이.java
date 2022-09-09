package boj;

import java.io.*;
import java.util.*;

public class Boj_2502_떡먹는호랑이 {
    static int D, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        D = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Loop : for (int i = 1; i < K; i++) {
            int[] arr = new int[D + 1];

            for (int j = i; j < K; j++) {
                arr[1] = i;
                arr[2] = j;

                for (int k = 3; k <= D ; k++) {
                    arr[k] = arr[k - 1] + arr[k - 2];

                    // success
                    if(k == D && arr[k] == K){
                        System.out.println(i);
                        System.out.println(j);
                        break Loop;
                    }

                    if( k != D && arr[k] > K)
                        break;

                }

            }

        }
    }

}
