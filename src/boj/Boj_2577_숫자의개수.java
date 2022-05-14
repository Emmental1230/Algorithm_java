package boj;

import java.util.*;
import java.io.*;

public class Boj_2577_숫자의개수 {
    static int A,B,C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        int num = A*B*C;
        int[] arr = new int[10];
        while (num > 0) {
            int tmp = num %10;  // 10으로 나눈 나머지
            arr[tmp]++;
            num /= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
