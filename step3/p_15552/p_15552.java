package step3.p_15552;
// 시간초과
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] sumArr = new int[N];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] intArr = line.split(" ");

            sumArr[i] = Integer.parseInt(intArr[0]) + Integer.parseInt(intArr[1]);
        }
        for(int i = 0; i < N; i++) {
            System.out.println(sumArr[i]);
        }

    }
    
}
