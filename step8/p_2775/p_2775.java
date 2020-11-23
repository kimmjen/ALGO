package step8.p_2775;

import java.io.*;

public class p_2775 {

    public static int[][] APT = new int[15][15];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        make_APT();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            sb.append(APT[n][k]).append('\n');
        }
        System.out.println(sb);
    }
    public static void make_APT() {
        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1;
            APT[0][i] = i;
        }

        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }
        
    }
    
}
