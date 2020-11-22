package step5.p_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1546_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int Max = -1;
        double Sum = 0.0;

        for(int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            if(value > Max) {
                Max = value;
            }
            Sum += value;
        }
        System.out.println( ((Sum/Max) * 100.0) / N);
    }
    
}
