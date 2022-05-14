package boj;
import java.util.*;
import java.io.*;

/**
 * 다음 토큰 있는지 확인 : hasMoreTokens()
 * 총 토큰 수 확인 : countTokens()
 */
public class Boj_1152_단어의개수 {
    static String s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while(st.hasMoreTokens()){
            st.nextToken();
            count++;
        }
        System.out.println(count);
    }
}
