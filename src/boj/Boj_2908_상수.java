package boj;

import java.io.*;
import java.util.*;

public class Boj_2908_상수 {
    static int A, B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        int Areverse = 0;
        int Breverse = 0;

        Areverse = A/100 + A%10 *100 + (A%100)/10 *10;
        Breverse = B/100 + B%10 *100 + (B%100)/10 *10;

        System.out.println(Math.max(Areverse, Breverse));
    }
}
