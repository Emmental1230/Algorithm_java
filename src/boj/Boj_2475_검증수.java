package boj;

import java.util.*;
import java.io.*;

public class Boj_2475_검증수 {
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num*num;
        }
        System.out.println(sum%10);

    }
}
