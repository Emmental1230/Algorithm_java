package boj;

import java.io.*;
import java.util.*;

public class Boj_2292_벌집 {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int cnt = 1;
        int sum = 2;

        if (N == 1) {
            System.out.println(1);
        }
        else {
            while (sum <= N) {
                sum += (6 * cnt++);
            }
            System.out.println(cnt);
        }
    }
}