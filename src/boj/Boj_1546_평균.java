package boj;

import java.io.*;
import java.util.*;

public class Boj_1546_평균 {
    static int N;
    static float[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new float[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if(max < num)
                max = num;
        }
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] /= max;
            sum += arr[i]*100;
        }
        System.out.println(sum/N);
    }
}
