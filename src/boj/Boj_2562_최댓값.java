package boj;

import java.util.*;
import java.io.*;

public class Boj_2562_최댓값 {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[9];
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]){
                max = arr[i];
                maxIdx = i+1;
            }

        }
        System.out.println(max);
        System.out.println(maxIdx);
    }
}
