package step3.p_2438;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < N+1; i++) {
            for(int j = 1; j < i+1; j++) {
                bw.write('*');
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    
}
