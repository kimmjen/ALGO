package step4.p_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        int first = 0, second = 0;
        int temp = 0, cnt = 0;

        first = N / 10;
        second = N % 10;

        while(true) {
            cnt++;
            temp = second;
            second = (first + second) % 10;
            first = temp;

            if(N == first * 10 + second)
                break;
        }
        System.out.println(cnt);
    }
    
}
