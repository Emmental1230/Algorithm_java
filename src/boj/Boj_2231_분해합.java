package boj;

import java.util.*;

public class Boj_2231_분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;

        for (int i = 1; i < N; i++) {
            String s = Integer.toString(i);
            char[] c = s.toCharArray();
            int sum = i;
            for (int j = 0; j < c.length; j++) {
                sum += (int) (c[j] - '0');
            }
            if (sum == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);


    }

}
