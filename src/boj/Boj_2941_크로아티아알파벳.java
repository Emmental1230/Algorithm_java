package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2941_크로아티아알파벳 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = br.readLine();
        for (int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i]))
                s = s.replace(arr[i], "#");
        }

        System.out.println(s.length());

    }
}
