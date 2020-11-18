package step4.p_1110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p_1110_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        int total = number;
        int count = 0;

        do {
            total = ((total % 10) * 10) + (((total/10) + (total % 10)) % 10);
            count++;
        } while (total != number);
        bw.write(String.valueOf(count));
        bw.close();
    }
}
