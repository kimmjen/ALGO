package step3.p_2439;

import java.io.*;

public class p_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i < T + 1; i++) {
            for (int j = 0; j < T - i; j++) {
                bw.write(' ');
            }
            for (int j = 1; j < i + 1; j++) {
                bw.write('*');
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }
}
