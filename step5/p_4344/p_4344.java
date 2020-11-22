package step5.p_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] Arr;

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            Arr = new int[N];

            double sum = 0;

            for(int j = 0; j < N; j++) {
                int val = Integer.parseInt(st.nextToken());
                Arr[j] = val;
                sum += val;
            }
            double mean = (sum / N);
            double count = 0;

            for(int j = 0; j < N; j++) {
                if(Arr[j] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
    }
    
}
