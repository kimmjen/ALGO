package step3.p_10871;

import java.io.*;
import java.util.StringTokenizer;

public class p_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String s;
        int n, x, a;

        s = br.readLine();
        st = new StringTokenizer(s);
        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        s = br.readLine();
        st = new StringTokenizer(s);
        for(int i = 0; i < n; i++) {
            a = Integer.parseInt(st.nextToken());
            if(a < x) {
                bw.write(String.valueOf(a));
                if(i < n-1) bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
    }
    
}
