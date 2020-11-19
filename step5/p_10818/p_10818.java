package step5.p_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] Arr = new int[N];

        while(st.hasMoreTokens()) {
            Arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(Arr);
        System.out.println(Arr[0] + " " + Arr[N - 1]);
    }
    
}
