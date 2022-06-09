package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10250_ACM호텔 {
    static int T, W, H, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());   // 높이
            W = Integer.parseInt(st.nextToken());   // 방 수
            N = Integer.parseInt(st.nextToken());   // 인원 수

            int xx;
            int yy;
            if (N % H == 0) {
                xx = N / H;
                yy = H;
            } else {
                xx = N / H + 1;
                yy = N % H ;
            }

            if (xx < 10) {
                sb.append(yy).append(0).append(xx);
            }else{
                sb.append(yy).append(xx);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
