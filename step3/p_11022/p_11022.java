package step3.p_11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            bw.write("Case #" + (i+1)+ ": ");
            StringTokenizer st = new StringTokenizer(br.readLine());

            bw.write(Integer.toString(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
            bw.newLine();
        }
        br.close();
        bw.flush();
    }
    
}
