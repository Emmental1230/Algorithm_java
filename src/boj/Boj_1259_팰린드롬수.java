package boj;

import java.util.*;
import java.io.*;

public class Boj_1259_팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String num = br.readLine();

            if (num.equals("0"))
                break;

            for (int i = 0; i <= (num.length()-1) / 2; i++) {
                if(num.charAt(i) != num.charAt(num.length()-1-i)){
                    sb.append("no").append("\n");
                    break;
                }
                if(i == (num.length()-1) / 2 )
                    sb.append("yes").append("\n");
            }
        }
        System.out.println(sb);
    }
}
